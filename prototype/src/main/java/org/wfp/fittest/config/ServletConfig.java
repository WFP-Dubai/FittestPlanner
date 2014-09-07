package org.wfp.fittest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Configures the behavior for the JSP servlet.
 * @author Sami Zeinelabdin
 */
@Configuration
@ComponentScan(basePackages = { "org.wfp.fittest.web" })
public class ServletConfig {

	/**
	 * Sets options related to JSP templating including the default template engine and
	 * the default location and prefix of jsp files.
	 * 
	 * @return InternalResourceViewResolver
	 * @see InternalResourceViewResolver
	 * @see JstlView
	 */
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setCache(false);
		return resolver;
	}
}
