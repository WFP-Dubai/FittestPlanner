package org.wfp.fittest.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;


public interface StaffService {
	public Map<String, List<Staff>> findStaffByActivityType();
	
	public Map<String, List<Staff>> findStaffByActivityType(Date fromDate);
	
	public List<Staff> findStaffByActivityType(ActivityType activityType);
	
	public List<Staff> findStaffAvailable(Date fromDate);
	
	public List<Staff> findStaffBreakInService(Date fromDate);

	public List<Staff> findStaffNotAvailable(Date fromDate);
	
	public List<StaffRole> findAllStaffRoles();
	
	public List<StaffRole> findStaffRolesActiveInDate(Date activeDate);
}
