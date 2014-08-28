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
import org.wfp.fittest.dto.StaffTypeDto;
import org.wfp.fittest.service.StaffService;

@Controller
@RequestMapping(value = "/staffType")
public class StaffTypeController {

	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "")
	public String staffType(Model model, Locale locale) {
		List<StaffTypeDto> staffTypes = staffService.findAllStaffTypes();
		model.addAttribute("allStaffTypes", staffTypes);
		return "staffType";
	}

	@RequestMapping(value = "/new")
	public String staffTypeNew(Model model, Locale locale) {
		model.addAttribute("staffType", new StaffTypeDto());
		return "forms/staff-type";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String staffTypeSave(@ModelAttribute StaffTypeDto staffType,
			Model model, Locale locale) {
		staffService.saveOrUpdateStaffType(staffType);
		return "redirect:/staffType";
	}

	@RequestMapping(value = "/{id}/view")
	public String staffTypeView(@PathVariable("id") Long id, Model model,
			Locale locale) {
		model.addAttribute("staffType", staffService.findStaffTypeNested(id));
		return "forms/staff-type";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String staffTypeDelete(@PathVariable("id") Long id, Model model,
			Locale locale) {
		staffService.deleteStaffTypeById(id);
		return "redirect:/staffType";
	}
}
