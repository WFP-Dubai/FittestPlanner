package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffType;
import org.wfp.fittest.service.StaffService;

@Controller
public class StaffController {

	private static final Logger logger = LoggerFactory
			.getLogger(StaffController.class);

	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staff(Locale locale, Model model) {
		logger.info("staff Page!", locale);
		List<Staff> allStaff = staffService.findAllStaff();
		model.addAttribute("allStaff", allStaff);
		return "main/staff";
	}

	@RequestMapping(value = "/staff/new", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String staffNew(@ModelAttribute("staffDetails") Staff staffDetails,
			Locale locale, Model model) {
		logger.info("new staff page!", locale);
		model.addAttribute("allStaffTypes", staffService.findAllStaffTypes());
		return "edit/staff";
	}

	@RequestMapping(value = "/staff/{staffIndex}", method = RequestMethod.GET)
	public String staffRead(@PathVariable("staffIndex") Integer staffIndex,
			Locale locale, Model model) {
		logger.info("staff read page!", locale);
		Staff staffDetails = staffService.findStaffByIndex(staffIndex);
		model.addAttribute("staffDetails", staffDetails);
		return "edit/staff";
	}

	@RequestMapping(value = "/staff/{staffIndex}/edit", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String staffEdit(@ModelAttribute("staffDetails") Staff staffDetails,
			@PathVariable("staffIndex") Integer staffIndex, Locale locale,
			Model model) {
		logger.info("new staff page!", locale);
		staffDetails = staffService.findStaffByIndex(staffIndex);
		model.addAttribute("staffDetails", staffDetails);
		model.addAttribute("allStaffTypes", staffService.findAllStaffTypes());
		return "edit/staff";
	}
}
