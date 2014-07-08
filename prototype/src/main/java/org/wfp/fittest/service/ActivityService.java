package org.wfp.fittest.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.wfp.fittest.beans.Activities;
import org.wfp.fittest.beans.ActivitySummary;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;

public interface ActivityService {

	public Activity findActivityById(Integer activityId);
	
	public Activities findAllActivities();
	
	public Activities findActivitiesByConfirmedType(ConfirmedType confirmedType);
	
	public Activities findAllConfirmedActivities();

	public Activities findAllNotConfirmedActivities();
	
	public Activities findActivitiesByActivityType(ActivityType activityType);

	public Activities findActivitiesByDescription(String description);
	
	public void saveActivity(Activity activity);
	
	public ActivityType findActivityTypeById(Integer id);
	
	public List<ActivityType> findAllActivityTypes();
	
	public void saveActivityType(ActivityType activity);
	
	public void deleteActivityTypeById(Integer id);
	
	public List<ActivitySummary> findActivitySummary(Date date);
	
	public Map<String, Integer> findActivityTypesWithId();
	
	public ActivityRole findActivityRoleById(Integer activityRoleID);
	
	public List<ActivityRole> findAllActivityRoles();
}
