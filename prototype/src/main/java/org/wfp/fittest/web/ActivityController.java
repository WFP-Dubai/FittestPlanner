package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.service.ActivityService;

@Controller
public class ActivityController {
	
	private static final Logger logger = LoggerFactory.getLogger(ActivityController.class);
	
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping(value = "/activity", method = RequestMethod.GET)
	public String activity(Locale locale, Model model) {
		logger.info("activity Page!", locale);
		model.addAttribute("activities", activityService.findAllActivities());
		return "activity";
	}
}
