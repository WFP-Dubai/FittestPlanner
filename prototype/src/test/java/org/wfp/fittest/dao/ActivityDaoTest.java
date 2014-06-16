package org.wfp.fittest.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wfp.fittest.entity.Activity;

public class ActivityDaoTest extends AbstractDaoTest {

	@Autowired
	private ActivityDao activityDao;
	
	@Before
	public void setUp() {}
	
	@After
	public void tearDown() {}
	
	@Test
	public void testFindAllActivities() {
		List<Activity> activities = activityDao.findAllActivities();
		assertNotNull(activities);
		assertEquals(activities.size(), 26);
	}
}
