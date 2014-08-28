package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.CountryDto;
import org.wfp.fittest.service.UtilityService;

@Controller
@RequestMapping(value = "/country")
public class CountryController {
	
	@Autowired
	private UtilityService utilityService;

	@RequestMapping(value = "")
	public String country(Model model, Locale locale) {
		List<CountryDto> countries = utilityService.findAllCountries();
		model.addAttribute("allCountries", countries);
		return "country";
	}
	
	@RequestMapping(value = "/{id}/view")
	public String countryView(@PathVariable("id") Long id, Model model,
			Locale locale) {
		model.addAttribute("country", utilityService.findCountryById(id));
		return "forms/country";
	}
	
	@RequestMapping(value = "/new")
	public String countryNew(Model model, Locale locale) {
		model.addAttribute("country", new CountryDto());
		return "forms/country";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String countrySave(@ModelAttribute CountryDto countryDto, Model model, Locale locale) {
		utilityService.saveOrUpdateCountry(countryDto);
		return "redirect:/country";
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String countryDelete(@PathVariable("id") Long id, Model model, Locale locale) {
		utilityService.deleteCountryById(id);
		return "redirect:/country";
	}
}
