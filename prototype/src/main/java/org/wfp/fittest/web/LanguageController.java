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
import org.wfp.fittest.dto.LanguageDto;
import org.wfp.fittest.service.UtilityService;

@Controller
@RequestMapping(value = "/language")
public class LanguageController {
	
	@Autowired
	private UtilityService utilityService;
	
	@RequestMapping(value = "")
	public String language(Model model, Locale locale) {
		List<LanguageDto> languages = utilityService.findAllLanguages();
		model.addAttribute("allLanguages", languages);
		return "language";
	}
	
	@RequestMapping(value = "/{id}/view")
	public String languageView(@PathVariable("id") Long id, Model model,
			Locale locale) {
		model.addAttribute("language", utilityService.findLanguageById(id));
		return "forms/language";
	}
	
	@RequestMapping(value = "/new")
	public String languageNew(Model model, Locale locale) {
		model.addAttribute("language", new LanguageDto());
		return "forms/language";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String languageSave(@ModelAttribute LanguageDto languageDto, Model model, Locale locale) {
		utilityService.saveOrUpdateLanguage(languageDto);
		return "redirect:/language";
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String languageDelete(@PathVariable("id") Long id, Model model, Locale locale) {
		utilityService.deleteLanguageById(id);
		return "redirect:/language";
	}
}
