package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.beans.RequirementCriteria;
import org.wfp.fittest.service.ActivityService;

@Controller
public class RequirementController {

	private static final Logger logger = LoggerFactory
			.getLogger(RequirementController.class);

	@Autowired
	private ActivityService activityService;

	@RequestMapping(value = "/requirement", method = RequestMethod.GET)
	public String requirement(Locale locale, Model model) {
		logger.info("Requirement Page!", locale);
		RequirementCriteria requirementCriteria = new RequirementCriteria();
		requirementCriteria.setActivities(activityService.findAllActivities()
				.getActivities());
		model.addAttribute("requirementCriteria", requirementCriteria);
		return "requirement";
	}
}
