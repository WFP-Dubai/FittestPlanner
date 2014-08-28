package org.wfp.fittest.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

@Component
public class AdminFilter implements Filter {

	private String[] excludePatterns = { "/fittesttracker/",
			"/fittesttracker/admin_error",
			"/fittesttracker/login", "/fittesttracker/logout",
			"/fittesttracker/authenticate",
			"/fittesttracker/fittesttracker/.*", "/fittesttracker/external/.*" };

	private String[] excludeMethods = { "GET" };

	private boolean matchesExcludePatterns(String url) {
		for (String pattern : this.excludePatterns) {
			if (url.matches(pattern)) {
				return true;
			}
		}
		return false;
	}

	private boolean matchesExcludeMethods(String method) {
		for (String pattern : this.excludeMethods) {
			if (method.equalsIgnoreCase(pattern)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		String url = request.getRequestURI();

		if (matchesExcludePatterns(url)) {
			chain.doFilter(req, res);
			return;
		} else {
			if (matchesExcludeMethods(request.getMethod())) {
				chain.doFilter(req, res);
			} else {
				HttpSession session = request.getSession(false);
				if (session == null || session.getAttribute("admin") == null) {
					response.sendRedirect(request.getContextPath() + "/admin_error");
					return;
				}
				else {
					chain.doFilter(req, res);					
				}
			}
		}
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}
}
