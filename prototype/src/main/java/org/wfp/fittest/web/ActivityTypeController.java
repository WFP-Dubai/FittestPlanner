package org.wfp.fittest.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.ActivityTypeDto;

@Controller
@RequestMapping(value = "/activityType")
public class ActivityTypeController extends AbstractController {
	
	@RequestMapping(value = "")
	public String activityType(Model model, Locale locale) {
		model.addAttribute("allActivityTypes",
				activityService.findAllActivityTypes());
		return "activityType";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String activityTypeSave(
			@ModelAttribute ActivityTypeDto activityTypeDto, Model model,
			Locale locale) {
		activityService.saveOrUpdateActivityType(activityTypeDto);
		return "redirect:/activityType";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String activityTypeNew(
			@ModelAttribute ActivityTypeDto activityTypeDto, Model model,
			Locale locale) {
		model.addAttribute("activityType", new ActivityTypeDto());
		return "forms/activity-type";
	}
	
	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String activityTypeDelete(@PathVariable("id") Long activityTypeId,
			Model model, Locale locale) {
		activityService.deleteActivityTypeById(activityTypeId);
		return "redirect:/activityType";
	}
	
	@RequestMapping(value = "/{id}/view")
	public String activityTypeView(@PathVariable("id") Long activityTypeId,
			Model model, Locale locale) {
		model.addAttribute("activityType",
				activityService.findActivityTypeNested(activityTypeId));
		return "forms/activity-type";
	}
}
