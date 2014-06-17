package org.wfp.fittest.service;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.beans.ActivitySummary;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityType;

public interface ActivityService {

	public List<Activity> findAllActivities();
	
	public List<ActivityType> findAllActivityTypes();
	
	public List<ActivitySummary> findActivitySummary(Date date);
}
