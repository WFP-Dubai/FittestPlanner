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
import org.wfp.fittest.dto.StaffDto;
import org.wfp.fittest.service.ActivityService;
import org.wfp.fittest.service.StaffService;
import org.wfp.fittest.service.UtilityService;

@Controller
@RequestMapping(value = "/staffList")
public class StaffController extends AbstractController {

	@Autowired
	private ActivityService activityService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private UtilityService utilityService;

	@RequestMapping(value = "")
	public String staff(Model model, Locale locale) {
		List<StaffDto> staff = staffService.findAllStaff();
		model.addAttribute("allStaff", staff);
		return "staff";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String staffSave(@ModelAttribute StaffDto staffDto, Model model, Locale locale) {
		staffService.saveOrUpdateStaff(staffDto);
		return "redirect:/staffList#staff-list";
	}

	@RequestMapping(value = "/new")
	public String staffView(Model model, Locale locale) {
		model.addAttribute("staff", new StaffDto());
		model.addAttribute("allStaffTypes", staffService.findAllStaffTypes());
		model.addAttribute("allProfileTypes",
				staffService.findAllProfileTypes());
		model.addAttribute("allNationalities",
				utilityService.findAllCountries());
		model.addAttribute("allLanguages", utilityService.findAllLanguages());
		return "forms/staff";
	}

	@RequestMapping(value = "/{id}/view")
	public String staffView(@PathVariable("id") Long staffId, Model model,
			Locale locale) {
		model.addAttribute("staff", staffService.findStaffNested(staffId));
		model.addAttribute("allStaffTypes", staffService.findAllStaffTypes());
		model.addAttribute("allProfileTypes",
				staffService.findAllProfileTypes());
		model.addAttribute("allNationalities",
				utilityService.findAllCountries());
		model.addAttribute("allLanguages", utilityService.findAllLanguages());
		return "forms/staff";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String staffDelete(@PathVariable("id") Long staffId, Model model,
			Locale locale) {
		staffService.deleteStaffById(staffId);
		return "redirect:/staffList#staff-list";
	}

}
