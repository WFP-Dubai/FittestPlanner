package org.wfp.fittest.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.data.rest.webmvc.RepositoryRestDispatcherServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.wfp.fittest.filter.AdminFilter;
import org.wfp.fittest.filter.LoginFilter;
import org.wfp.fittest.filter.SimpleCORSFilter;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		servletContext.setInitParameter("spring.profiles.active",
				"spring-data-jpa");

		WebApplicationContext rootContext = getRootContext();
		servletContext.addListener(new ContextLoaderListener(rootContext));

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
				"fittesttracker", new DispatcherServlet(rootContext));
		dispatcher.setInitParameter("trimSpaces", "true");
		dispatcher.setLoadOnStartup(3);
		dispatcher.addMapping("/");
	
		ServletRegistration.Dynamic restDispatcher = servletContext.addServlet(
				"rest", new RepositoryRestDispatcherServlet(rootContext));
		restDispatcher.setLoadOnStartup(1);
		restDispatcher.addMapping("/rest/*");
		
		// Planning page POST Error
		FilterRegistration.Dynamic corsFilter = servletContext.addFilter(
				"corsFilter", new SimpleCORSFilter());
		corsFilter.addMappingForUrlPatterns(null, true, "/*");

		FilterRegistration.Dynamic httpFilter = servletContext.addFilter(
				"httpMethodFilter", new HiddenHttpMethodFilter());
		httpFilter.addMappingForServletNames(null, true, "fittesttracker");

		FilterRegistration.Dynamic loginFilter = servletContext.addFilter(
				"loginFilter", new LoginFilter());
		loginFilter.addMappingForServletNames(null, true, "fittesttracker");
		
		/*
		FilterRegistration.Dynamic adminFilter = servletContext.addFilter(
				"adminFilter", new AdminFilter());
		adminFilter.addMappingForServletNames(null, true, "fittesttracker");
		*/
	}

	private AnnotationConfigWebApplicationContext getRootContext() {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.setDisplayName("FITTEST Tracker");
		rootContext.setConfigLocation("org.wfp.fittest.config");
		rootContext.register(AppConfig.class);
		return rootContext;
	}
}