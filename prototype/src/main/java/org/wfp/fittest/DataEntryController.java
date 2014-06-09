package org.wfp.fittest;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DataEntryController {
	
	private static final Logger logger = LoggerFactory.getLogger(DataEntryController.class);
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String dataEntry(Locale locale, Model model) {
		logger.info("Data entry Page!", locale);		
		return "data";
	}
}
