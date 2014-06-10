package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DeploymentController {
	
	private static final Logger logger = LoggerFactory.getLogger(DeploymentController.class);
	
	@RequestMapping(value = "/deployment", method = RequestMethod.GET)
	public String deployment(Locale locale, Model model) {
		logger.info("Deployment Page!", locale);		
		return "deployment";
	}
}
