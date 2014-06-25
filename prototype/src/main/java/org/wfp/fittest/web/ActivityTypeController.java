package org.wfp.fittest.web;

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
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.service.ActivityService;

@Controller
public class ActivityTypeController {
	private static final Logger logger = LoggerFactory
			.getLogger(ActivityController.class);

	@Autowired
	private ActivityService activityService;

	@RequestMapping(value = "/activitytype", method = RequestMethod.GET)
	public String activityType(Locale locale, Model model) {
		List<ActivityType> activityTypes = activityService
				.findAllActivityTypes();
		model.addAttribute("activityTypes", activityTypes);
		return "activityType";
	}

	@RequestMapping(value = "/activitytype/{activityTypeId}", method = RequestMethod.GET)
	public String activityType(@PathVariable("activityTypeId") Integer activityTypeId, Locale locale,
			Model model) {
		ActivityType activityType = activityService
				.findActivityTypeById(activityTypeId);
		model.addAttribute("activityType", activityType);
		return "activityTypeId";
	}
	

}
