package org.wfp.fittest.service;

import java.util.List;

import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityType;

public interface ActivityService {

	public List<Activity> findAllActivities();
}
