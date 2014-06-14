package org.wfp.fittest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.repository.ActivityRepository;
import org.wfp.fittest.service.ActivityService;

@Service
@Transactional(readOnly = false)
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityRepository;

	public ActivityRepository getActivityRepository() {
		return activityRepository;
	}

	public void setActivityRepository(ActivityRepository activityRepository) {
		this.activityRepository = activityRepository;
	}
	
	public Iterable<Activity> findAllActivities() {
		return activityRepository.findAll();
	}
	
}
