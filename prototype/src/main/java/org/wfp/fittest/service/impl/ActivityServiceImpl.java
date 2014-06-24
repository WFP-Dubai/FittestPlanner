package org.wfp.fittest.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.service.ActivityService;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityDao activityDao;

	@Override
	public Activity findActivityById(Integer activityId) {
		return activityDao.findActivityById(activityId);
	}
	
	@Override
	public Activities findAllActivities() {
		return new Activities(activityDao.findAllActivities());
	}
	
	@Override
	public Activities findActivitiesByActivityType(ActivityType activityType) {
		return new Activities(activityDao.findActivitiesByActivityType(activityType));
	}

	@Override
	public Activities findActivitiesByDescription(String description) {
		return new Activities(activityDao.findActivitiesByDescription(description));
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
	public List<ActivitySummary> findActivitySummary(Date startDate) {
		List<Object[]> activityTypes = activityDao.findActivityTypesWithStaffCount(startDate);
		List<ActivitySummary> activitySummaries = new ArrayList<ActivitySummary>();
		for (Object[] obj : activityTypes) {
			ActivitySummary actSummary = new ActivitySummary();
			actSummary.setActivityType(((ActivityType)obj[0]).getActivityType());
			actSummary.setNumberOfStaff((Long)obj[1]);
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
}
