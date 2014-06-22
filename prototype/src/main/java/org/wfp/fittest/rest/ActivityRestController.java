package org.wfp.fittest.rest;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.wfp.fittest.beans.Activities;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.service.ActivityService;

@Controller
public class ActivityRestController {

	private static final Logger logger = LoggerFactory
			.getLogger(ActivityRestController.class);

	@Autowired
	private ActivityService activityService;

	@RequestMapping(value = "/rest/activity", method = RequestMethod.GET)
	public @ResponseBody Activities activity(
			@RequestParam(value = "description", required = false) String activityDescription,
			Locale locale, Model model) {
		if (activityDescription != null) {
			return activityService
					.findActivitiesByDescription(activityDescription);
		} else {
			return activityService.findAllActivities();
		}
	}

	@RequestMapping(value = "/rest/activity/{activityId}", method = RequestMethod.GET)
	public @ResponseBody Activity activityById(
			@PathVariable Integer activityId, Locale locale, Model model) {
		return activityService.findActivityById(activityId);
	}
	
	@RequestMapping(value = "/rest/activitytype", method = RequestMethod.GET)
	public @ResponseBody List<ActivityType> activityType(Locale locale, Model model) {
		return activityService.findAllActivityTypes();
	}
}
