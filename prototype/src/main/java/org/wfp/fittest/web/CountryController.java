package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.Country;

@Controller
public class CountryController extends AbstractController {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Locale locale, Model model) {
		logger.info("country Page!", locale);
		List<Country> countries = utilityService.findAllCountries();
		model.addAttribute("countries", countries);
		return "main/country";
	}
}
