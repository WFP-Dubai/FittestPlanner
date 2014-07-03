package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlanningController {
	
	private static final Logger logger = LoggerFactory.getLogger(PlanningController.class);
	
	@RequestMapping(value = "/planning", method = RequestMethod.GET)
	public String planningEntry(Locale locale, Model model) {
		logger.info("Planning entry Page!", locale);		
		return "main/planning";
	}
}
