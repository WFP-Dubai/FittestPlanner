package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.beans.DeploymentCriteria;
import org.wfp.fittest.service.ActivityService;
import org.wfp.fittest.service.StaffService;

@Controller
public class DeploymentController {

	private static final Logger logger = LoggerFactory
			.getLogger(DeploymentController.class);

	@Autowired
	private ActivityService activityService;

	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "/deployment", method = RequestMethod.GET)
	public String deployment(Locale locale, Model model) {
		logger.info("Deployment Page!", locale);
		DeploymentCriteria deploymentCriteria = new DeploymentCriteria();
		deploymentCriteria.setActivities(activityService.findAllActivities()
				.getActivities());
		deploymentCriteria.setStaffTypes(staffService.findAllStaffTypes());
		model.addAttribute("deploymentCriteria", deploymentCriteria);
		return "deployment";
	}
}
