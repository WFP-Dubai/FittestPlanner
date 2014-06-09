package org.wfp.fittest;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ActivityController {
	
	private static final Logger logger = LoggerFactory.getLogger(ActivityController.class);
	
	@RequestMapping(value = "/activity", method = RequestMethod.GET)
	public String activity(Locale locale, Model model) {
		logger.info("activity Page!", locale);		
		return "activity";
	}
}
