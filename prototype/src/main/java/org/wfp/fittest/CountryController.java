package org.wfp.fittest;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CountryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Locale locale, Model model) {
		logger.info("country Page!", locale);		
		return "country";
	}
}
