package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StaffController {
	
	private static final Logger logger = LoggerFactory.getLogger(StaffController.class);
	
	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staff(Locale locale, Model model) {
		logger.info("staff Page!", locale);	
		return "staff";
	}
}
