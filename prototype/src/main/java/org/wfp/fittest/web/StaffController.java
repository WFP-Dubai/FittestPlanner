package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.service.StaffService;

@Controller
public class StaffController {
	
	private static final Logger logger = LoggerFactory.getLogger(StaffController.class);
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staff(Locale locale, Model model) {
		logger.info("staff Page!", locale);
		List<Staff> allStaff = staffService.findAllStaff();
		model.addAttribute("allStaff", allStaff);
		return "staff";
	}
	
	@RequestMapping(value = "/staff/new", method = RequestMethod.GET)
	public String staffNew(Locale locale, Model model) {
		logger.info("new staff page!", locale);
		Staff staffDetails = new Staff();
		model.addAttribute("staffDetails", staffDetails);
		return "staff-form";
	}
}
