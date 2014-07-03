package org.wfp.fittest.web;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.service.ActivityService;
import org.wfp.fittest.service.StaffService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ActivityService activityService;
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date fromDate = new GregorianCalendar(2014,0,1).getTime();
		
		Map<String, Integer> activityTypesWithId = activityService.findActivityTypesWithId();
		model.addAttribute("activityTypesWithId", activityTypesWithId);
		
		Map<String, List<Staff>> staffByActivityType = staffService.findStaffByActivityType(fromDate);
		model.addAttribute("staffByActivityType", staffByActivityType);
		
		List<Staff> breakInService = staffService.findStaffBreakInService(fromDate);
		model.addAttribute("breakInService", breakInService);
		
		List<Staff> availableStaff = staffService.findStaffAvailable(fromDate);
		model.addAttribute("availableStaff", availableStaff);
		
		List<Staff> notAvailableStaff = staffService.findStaffNotAvailable(fromDate);
		model.addAttribute("notAvailableStaff", notAvailableStaff);
		
		List<StaffRole> staffRoles = staffService.findStaffRolesActiveInDate(fromDate);
		model.addAttribute("staffRoles", staffRoles);
		
		Map<String, Integer> activityTypeChartData = staffService.findStaffCountByActivityType(fromDate);
		model.addAttribute("activityTypeChartData", activityTypeChartData);
		
		return "main/home";
	}
	
}
