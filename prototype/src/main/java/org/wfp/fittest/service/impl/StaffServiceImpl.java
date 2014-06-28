package org.wfp.fittest.service.impl;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.dao.ActivityDao;
import org.wfp.fittest.dao.StaffDao;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;
import org.wfp.fittest.service.StaffService;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffDao staffDao;
	
	@Autowired
	private ActivityDao activityDao;
	
	@Override
	public List<Staff> findAllStaff() {
		return staffDao.findAllStaff();
	}
	
	@Override
	public Map<String, List<Staff>> findStaffByActivityType() {
		Map<String, List<Staff>> mapStaff = new HashMap<String, List<Staff>>();
		List<ActivityType> activityTypes = activityDao.findAllActivityTypes();
		for (ActivityType activityType : activityTypes) {
			List<Staff> staff = staffDao.findStaffByActivityType(activityType);
			mapStaff.put(activityType.getActivityType(), staff);
		}
		return mapStaff;
	}

	@Override
	public Map<String, List<Staff>> findStaffByActivityType(Date fromDate) {
		Map<String, List<Staff>> mapStaff = new HashMap<String, List<Staff>>();
		List<ActivityType> activityTypes = activityDao.findAllActivityTypes();
		for (ActivityType activityType : activityTypes) {
			List<Staff> staff = staffDao.findStaffByActivityTypeInDate(activityType, fromDate);
			mapStaff.put(activityType.getActivityType(), staff);
		}
		return mapStaff;
	}
	
	@Override
	public Map<String, Integer> findStaffCountByActivityType(Date fromDate) {
		Map<String, Integer> activityPercentage = new HashMap<String, Integer>();
		Map<String, List<Staff>> mapStaff = findStaffByActivityType(fromDate);
		for (Entry<String, List<Staff>> entry : mapStaff.entrySet()) {
			activityPercentage.put((String) entry.getKey(), ((List<Staff>) entry.getValue()).size());
		}
		return activityPercentage;
	}
	
	@Override
	public List<Staff> findStaffByActivityType(ActivityType activityType) {
		return staffDao.findStaffByActivityType(activityType);
	}

	@Override
	public List<Staff> findStaffAvailable(Date fromDate) {
		return staffDao.findStaffAvailable(fromDate);
	}

	@Override
	public List<Staff> findStaffNotAvailable(Date fromDate) {
		return staffDao.findStaffNotAvailable(fromDate);
	}

	@Override
	public List<Staff> findStaffBreakInService(Date fromDate) {
		ActivityType activityType1 = activityDao.findActivityTypeByActivityType("Break in Service");
		ActivityType activityType2 = activityDao.findActivityTypeByActivityType("Leave");
		return staffDao.findStaffByActivityTypesInDate(Arrays.asList(activityType1, activityType2), fromDate);
	}
	
	@Override
	public List<StaffRole> findAllStaffRoles() {
		return staffDao.findAllStaffRoles();
	}

	@Override
	public List<StaffRole> findStaffRolesActiveInDate(Date activeDate) {
		return staffDao.findStaffRolesActiveInDate(activeDate);
	}
	
	@Override
	public List<StaffType> findAllStaffTypes() {
		return staffDao.findAllStaffTypes();
	}

	@Override
	public List<ProfileType> findAllProfileTypes() {
		return staffDao.findAllProfileTypes();
	}
}
