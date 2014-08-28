package org.wfp.fittest.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.ActivityRoleDto;

@Controller
@RequestMapping(value = "/activityRole")
public class ActivityRoleController extends AbstractController {

	@RequestMapping(value = "")
	public String activityRole(Model model, Locale locale) {
		model.addAttribute("allActivityRoles",
				activityService.findAllActivityRoles());
		return "activityRole";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String activityRoleSave(
			@ModelAttribute ActivityRoleDto activityRoleDto, Model model,
			Locale locale) {
		activityService.saveOrUpdateActivityRole(activityRoleDto);
		return "redirect:/activityRole";
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String activityRoleNew(
			@ModelAttribute ActivityRoleDto activityRoleDto, Model model,
			Locale locale) {
		model.addAttribute("activityRole", new ActivityRoleDto());
		model.addAttribute("allActivities", activityService.findAllActivities());
		model.addAttribute("allProfileTypes",
				staffService.findAllProfileTypes());
		model.addAttribute("allStaffRoles", staffService.findAllStaffRoles());
		return "forms/activity-role";
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String activityRoleDelete(@PathVariable("id") Long activityRoleId,
			Model model, Locale locale) {
		activityService.deleteActivityRoleById(activityRoleId);
		return "redirect:/activityRole";
	}

	@RequestMapping(value = "/{id}/view")
	public String activityRoleView(@PathVariable("id") Long activityRoleId,
			Model model, Locale locale) {
		model.addAttribute("activityRole",
				activityService.findActivityRoleNested(activityRoleId));
		model.addAttribute("allActivities", activityService.findAllActivities());
		model.addAttribute("allProfileTypes",
				staffService.findAllProfileTypes());
		model.addAttribute("allStaffRoles", staffService.findAllStaffRoles());
		return "forms/activity-role";
	}
}
