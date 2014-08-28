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
import org.wfp.fittest.dto.ConfirmedTypeDto;
import org.wfp.fittest.service.UtilityService;

@Controller
@RequestMapping(value = "/confirmedType")
public class ConfirmedTypeController {

	@Autowired
	private UtilityService utilityService;

	@RequestMapping(value = "")
	public String confirmedType(Model model, Locale locale) {
		List<ConfirmedTypeDto> confirmedTypes = utilityService
				.findAllConfirmedTypes();
		model.addAttribute("allConfirmedTypes", confirmedTypes);
		return "confirmedType";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String confirmedTypeSave(@ModelAttribute ConfirmedTypeDto confirmedTypeDto, Model model, Locale locale) {
		utilityService.saveOrUpdateConfirmedType(confirmedTypeDto);
		return "redirect:/confirmedType";
	}
	
	@RequestMapping(value = "new")
	public String confirmedTypeNew(Model model, Locale locale) {
		model.addAttribute("confirmedType", new ConfirmedTypeDto());
		return "forms/confirmed-type";
	}

	@RequestMapping(value = "/{id}/view")
	public String confirmedTypeView(@PathVariable("id") Long confirmedTypeId,
			Model model, Locale locale) {
		ConfirmedTypeDto dto = utilityService.findConfirmedTypeNested(confirmedTypeId);
		model.addAttribute("confirmedType", dto);
		return "forms/confirmed-type";
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String confirmedTypeDelete(@PathVariable("id") Long confirmedTypeId,
			Model model, Locale locale) {
		utilityService.deleteConfirmedTypeById(confirmedTypeId);
		return "redirect:/confirmedType";
	}
}
