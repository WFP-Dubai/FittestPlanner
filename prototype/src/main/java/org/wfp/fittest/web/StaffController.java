package org.wfp.fittest.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;

@Controller
public class StaffController extends AbstractController {

	private static final Logger logger = LoggerFactory
			.getLogger(StaffController.class);

	@RequestMapping(value = "/staff", method = RequestMethod.GET)
	public String staff(Locale locale, Model model) {
		logger.info("staff Page!", locale);
		return "main/staff";
	}

	@RequestMapping(value = "/staff/new", method = RequestMethod.GET)
	public String staffNew(@ModelAttribute("staffDetails") Staff staffDetails,
			Locale locale, Model model) {
		logger.info("new staff page!", locale);
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

	@RequestMapping(value = "/staff/{staffIndex}/edit", method = RequestMethod.GET)
	public String staffEdit(@ModelAttribute("staffDetails") Staff staffDetails,
			@PathVariable("staffIndex") Integer staffIndex, Locale locale,
			Model model) {
		logger.info("new staff page!", locale);
		staffDetails = staffService.findStaffByIndex(staffIndex);
		model.addAttribute("staffDetails", staffDetails);
		return "edit/staff";
	}

	@RequestMapping(value = "/staff/save", method = RequestMethod.POST)
	public String staffSave(@ModelAttribute("staffDetails") Staff staffDetails,
			Locale locale, Model model) {
		logger.info("new staff page!", locale);
		staffService.saveStaff(staffDetails);
		return "redirect:/staff";
	}

	@RequestMapping(value = "/staff/{staffIndex}/delete", method = RequestMethod.POST)
	public String staffDelete(@PathVariable("staffIndex") Integer staffIndex,
			Locale locale, Model model) {
		logger.info("delete staff page!", locale);
		staffService.deleteStaffByIndex(staffIndex);
		return "redirect:/staff";
	}
	
	@RequestMapping(value = "/staff/role/new", method = { RequestMethod.GET,
			RequestMethod.POST })
	public String staffNew(
			@ModelAttribute("staffRoleDetails") StaffRole staffRoleDetails,
			Locale locale, Model model) {
		logger.info("staff role edit page!", locale);
		return "edit/staffRole";
	}

	@RequestMapping(value = "/staff/role/{staffRoleID}/edit", method = {
			RequestMethod.GET, RequestMethod.POST })
	public String staffEdit(
			@ModelAttribute("staffRoleDetails") StaffRole staffRoleDetails,
			@PathVariable("staffRoleID") Integer staffRoleID, Locale locale,
			Model model) {
		logger.info("staff role edit page!", locale);
		staffRoleDetails = staffService.findStaffRoleById(staffRoleID);
		model.addAttribute("staffRoleDetails", staffRoleDetails);
		return "edit/staffRole";
	}
}
