package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.StaffRoleDto;

@Controller
@RequestMapping(value = "/staffRole")
public class StaffRoleController extends AbstractController {
	
	@RequestMapping(value = "")
	public String staffRole(Model model, Locale locale) {
		List<StaffRoleDto> staffRoles = staffService.findAllStaffRoles();
		model.addAttribute("allStaffRoles", staffRoles);
		return "staffRole";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String staffRoleSave(@ModelAttribute StaffRoleDto staffRoleDto, Model model,
			Locale locale) {
		staffService.saveOrUpdateStaffRole(staffRoleDto);
		return "redirect:/staffRole";
	}

	@RequestMapping(value = "/new")
	public String staffRoleNew(Model model, Locale locale) {
		model.addAttribute("staffRole", new StaffRoleDto());
		model.addAttribute("allConfirmedTypes",
				utilityService.findAllConfirmedTypes());
		model.addAttribute("allActivityRoles",
				activityService.findAllActivityRoles());
		model.addAttribute("allStaff", staffService.findAllStaff());
		return "forms/staff-role";
	}

	@RequestMapping(value = "/{id}/view")
	public String staffRoleView(@PathVariable("id") Long id, Model model,
			Locale locale) {
		model.addAttribute("staffRole", staffService.findStaffRoleNested(id));
		model.addAttribute("allConfirmedTypes",
				utilityService.findAllConfirmedTypes());
		model.addAttribute("allActivityRoles",
				activityService.findAllActivityRoles());
		model.addAttribute("allStaff", staffService.findAllStaff());
		return "forms/staff-role";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String staffDelete(@PathVariable("id") Long staffRoleId, Model model,
			Locale locale) {
		staffService.deleteStaffRoleById(staffRoleId);
		return "redirect:/staffRole";
	}
}
