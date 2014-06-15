package org.wfp.fittest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.dao.ActivityDao;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.service.ActivityService;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityDao activityDao;

	public List<Activity> findAllActivities() {
		return activityDao.findAllActivities();
	}

}
