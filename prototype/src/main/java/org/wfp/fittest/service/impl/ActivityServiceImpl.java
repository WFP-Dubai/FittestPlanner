package org.wfp.fittest.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.beans.Activities;
import org.wfp.fittest.beans.ActivitySummary;
import org.wfp.fittest.beans.Deployment;
import org.wfp.fittest.beans.DeploymentCriteria;
import org.wfp.fittest.beans.Requirement;
import org.wfp.fittest.beans.RequirementCriteria;
import org.wfp.fittest.dao.ActivityDao;
import org.wfp.fittest.dao.UtilityDao;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.service.ActivityService;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityDao activityDao;

	@Autowired
	UtilityDao utilityDao;

	@Override
	public Activity findActivityById(Integer activityId) {
		return activityDao.findActivityById(activityId);
	}

	@Override
	public Activities findAllActivities() {
		return new Activities(activityDao.findAllActivities());
	}

	@Override
	public Activities findActivitiesByConfirmedType(ConfirmedType confirmedType) {
		return new Activities(
				activityDao.findActivitiesByConfirmedType(confirmedType));
	}

	@Override
	public Activities findAllConfirmedActivities() {
		String confirmedType = "Confirmed";
		return findActivitiesByConfirmedType(utilityDao
				.findConfirmedTypeByConfirmedType(confirmedType));
	}

	@Override
	public Activities findAllNotConfirmedActivities() {
		String confirmedType = "Not Confirmed";
		return findActivitiesByConfirmedType(utilityDao
				.findConfirmedTypeByConfirmedType(confirmedType));
	}

	@Override
	public Activities findActivitiesByActivityType(ActivityType activityType) {
		return new Activities(
				activityDao.findActivitiesByActivityType(activityType));
	}

	@Override
	public Activities findActivitiesByDescription(String description) {
		return new Activities(
				activityDao.findActivitiesByDescription(description));
	}

	@Override
	@Transactional(readOnly = false)
	public void saveActivity(Activity activity) {
		activityDao.saveActivity(activity);
	}

	@Override
	public ActivityType findActivityTypeById(Integer id) {
		return activityDao.findActivityTypeById(id);
	}

	@Override
	public List<ActivityType> findAllActivityTypes() {
		return activityDao.findAllActivityTypes();
	}

	@Override
	@Transactional(readOnly = false)
	public void saveActivityType(ActivityType activityType) {
		activityDao.saveActivityType(activityType);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteActivityTypeById(Integer id) {
		activityDao.deleteActivityTypeById(id);
	}

	@Override
	public List<ActivitySummary> findActivitySummary(Date startDate) {
		List<Object[]> activityTypes = activityDao
				.findActivityTypesWithStaffCount(startDate);
		List<ActivitySummary> activitySummaries = new ArrayList<ActivitySummary>();
		for (Object[] obj : activityTypes) {
			ActivitySummary actSummary = new ActivitySummary();
			actSummary.setActivityType(((ActivityType) obj[0])
					.getActivityType());
			actSummary.setNumberOfStaff((Long) obj[1]);
			activitySummaries.add(actSummary);
		}
		return activitySummaries;
	}

	public Requirement findRequirement(RequirementCriteria criteria) {
		return null;
	}

	public Deployment findDeployment(DeploymentCriteria criteria) {
		return null;
	}

	@Override
	public Map<String, Integer> findActivityTypesWithId() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (ActivityType activityType : findAllActivityTypes()) {
			map.put(activityType.getActivityType(), activityType.getID());
		}
		return map;
	}

	@Override
	public ActivityRole findActivityRoleById(Integer activityRoleID) {
		return activityDao.findActivityRoleById(activityRoleID);
	}

	@Override
	public List<ActivityRole> findAllActivityRoles() {
		return activityDao.findAllActivityRoles();
	}
}
