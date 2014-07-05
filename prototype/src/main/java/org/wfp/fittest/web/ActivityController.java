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
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;

@Controller
public class ActivityController extends AbstractController {

	private static final Logger logger = LoggerFactory
			.getLogger(ActivityController.class);
	
	@RequestMapping(value = "/activity", method = RequestMethod.GET)
	public String activity(Locale locale, Model model) {
		logger.info("activity Page!", locale);
		return "main/activity";
	}

	@RequestMapping(value = "/activity/new", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String activityNew(
			@ModelAttribute("activityDetails") Activity activityDetails,
			Locale locale, Model model) {
		logger.info("activity new Page!", locale);
		return "edit/activity";
	}

	@RequestMapping(value = "/activity/{activityID}/edit", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String activityEdit(
			@ModelAttribute("activityDetails") Activity activityDetails,
			@PathVariable("activityID") Integer activityID, Locale locale,
			Model model) {
		logger.info("activity edit Page!", locale);
		activityDetails = activityService.findActivityById(activityID);
		model.addAttribute("activityDetails", activityDetails);
		return "edit/activity";
	}

	@RequestMapping(value = "/activity/{activityID}", method = { RequestMethod.GET })
	public String activityRead(@PathVariable("activityID") Integer activityID,
			Locale locale, Model model) {
		logger.info("activity edit Page!", locale);
		Activity activityDetails = activityService.findActivityById(activityID);
		model.addAttribute("activityDetails", activityDetails);
		return "read/activity";
	}

	@RequestMapping(value = "/activity/type", method = RequestMethod.GET)
	public String activityType(Locale locale, Model model) {
		logger.info("activity types Page!", locale);
		logger.info("activity types Page!", locale);
		return "main/activityType";
	}

	@RequestMapping(value = "/activity/type/{activityTypeID}", method = RequestMethod.GET)
	public String activityTypeRead(
			@PathVariable("activityTypeID") Integer activityTypeID,
			Locale locale, Model model) {
		logger.info("activity type view Page!", locale);
		ActivityType activityType = activityService
				.findActivityTypeById(activityTypeID);
		model.addAttribute("activityType", activityType);
		return "activityTypeId";
	}

	@RequestMapping(value = "/activity/type/{activityTypeID}/edit", method = RequestMethod.GET)
	public String activityTypeEdit(
			@ModelAttribute("activityTypeDetails") ActivityType activityTypeDetails,
			@PathVariable("activityTypeID") Integer activityTypeID,
			Locale locale, Model model) {
		logger.info("activity type edit Page!", locale);
		activityTypeDetails = activityService
				.findActivityTypeById(activityTypeID);
		model.addAttribute("activityTypeDetails", activityTypeDetails);
		return "edit/activityType";
	}

	@RequestMapping(value = "/activity/type/new", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String activityTypeNew(
			@ModelAttribute("activityTypeDetails") ActivityType activityTypeDetails,
			Locale locale, Model model) {
		logger.info("activity type new Page!", locale);
		return "edit/activityType";
	}

	@RequestMapping(value = "/activity/role/{activityRoleID}/edit", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String activityRoleEdit(
			@ModelAttribute("activityRoleDetails") ActivityRole activityRoleDetails,
			@PathVariable("activityRoleID") Integer activityRoleID,
			Locale locale, Model model) {
		logger.info("activity role edit Page!", locale);
		activityRoleDetails = activityService.findActivityRoleById(activityRoleID);
		model.addAttribute("activityRoleDetails", activityRoleDetails);
		return "edit/activityRole";
	}

	@RequestMapping(value = "/activity/role/new", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String activityRoleNew(
			@ModelAttribute("activityRoleDetails") ActivityRole activityRoleDetails,
			Locale locale, Model model) {
		logger.info("activity role new Page!", locale);
		return "edit/activityRole";
	}

}
