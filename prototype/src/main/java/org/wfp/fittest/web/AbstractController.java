package org.wfp.fittest.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;
import org.wfp.fittest.service.ActivityService;
import org.wfp.fittest.service.StaffService;
import org.wfp.fittest.service.UtilityService;

@Controller
public abstract class AbstractController {

	@Autowired
	protected ActivityService activityService;

	@Autowired
	protected StaffService staffService;
	
	@Autowired
	protected UtilityService utilityService;
	
	@ModelAttribute("allActivityTypes")
	public List<ActivityType> populateActivityTypes() {
		return activityService.findAllActivityTypes();
	}

	@ModelAttribute("allActivities")
	public List<Activity> populateActivities() {
		return activityService.findAllActivities().getActivities();
	}

	@ModelAttribute("allConfirmedActivities")
	public List<Activity> populateConfirmedActivities() {
		return activityService.findAllConfirmedActivities().getActivities();
	}
	
	@ModelAttribute("allNotConfirmedActivities")
	public List<Activity> populateNotConfirmedActivities() {
		return activityService.findAllNotConfirmedActivities().getActivities();
	}
	
	@ModelAttribute("allActivityRoles")
	public List<ActivityRole> populateActivityRoles() {
		return activityService.findAllActivityRoles();
	}
	
	@ModelAttribute("allStaff")
	public List<Staff> populateStaff() {
		return staffService.findAllStaff();
	}
	
	@ModelAttribute("allStaffRoles")
	public List<StaffRole> populateStaffRoles() {
		return staffService.findAllStaffRoles();
	}
	
	@ModelAttribute("allStaffTypes")
	public List<StaffType> populateStaffTypes() {
		return staffService.findAllStaffTypes();
	}
	
	@ModelAttribute("allProfileTypes")
	public List<ProfileType> populateProfileTypes() {
		return staffService.findAllProfileTypes();
	}
	
	@ModelAttribute("allConfirmedTypes")
	public List<ConfirmedType> populateConfirmedTypes() {
		return staffService.findAllConfirmedTypes();
	}
	
	@ModelAttribute("allCountries")
	public List<Country> populateCountries() {
		return utilityService.findAllCountries();
	}
}
