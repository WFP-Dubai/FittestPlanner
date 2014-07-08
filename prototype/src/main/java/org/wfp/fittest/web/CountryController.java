package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.Country;

@Controller
public class CountryController extends AbstractController {
	
	private static final Logger logger = LoggerFactory.getLogger(CountryController.class);
	
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public String country(Locale locale, Model model) {
		logger.info("country Page!", locale);
		return "main/country";
	}
	
	@RequestMapping(value = "/country/new", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String countryNew(
			@ModelAttribute("countryDetails") Country countryDetails,
			Locale locale, Model model) {
		logger.info("country new Page!", locale);
		return "edit/country";
	}

	@RequestMapping(value = "/country/{countryID}/edit", method = RequestMethod.GET)
	public String countryEdit(
			@ModelAttribute("countryDetails") Country countryDetails,
			@PathVariable("countryID") Integer countryID, Locale locale,
			Model model) {
		logger.info("country edit Page!", locale);
		countryDetails = utilityService.findCountryById(countryID);
		model.addAttribute("countryDetails", countryDetails);
		return "edit/country";
	}

	@RequestMapping(value = "/country/save", method = RequestMethod.POST)
	public String countrySave(
			@ModelAttribute("countryDetails") Country countryDetails,
			@PathVariable("countryID") Integer countryID, Locale locale,
			Model model) {
		logger.info("country edit submit Page!", locale);
		utilityService.saveCountry(countryDetails);
		return "redirect:/country";
	}
}
