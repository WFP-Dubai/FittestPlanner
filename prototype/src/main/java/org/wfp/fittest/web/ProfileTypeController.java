package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProfileTypeController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileTypeController.class);
	
	@RequestMapping(value = "/profiletype", method = RequestMethod.GET)
	public String profileType(Locale locale, Model model) {
		logger.info("Profile Type Page!", locale);		
		return "profiletype";
	}
}
