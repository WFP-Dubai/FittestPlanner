package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.repository.CountryRepository;

@Controller
public class CountryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	@Autowired
	private CountryRepository countryRepository;
	
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Locale locale, Model model) {
		logger.info("country Page!", locale);
		
		return "country";
	}
}
