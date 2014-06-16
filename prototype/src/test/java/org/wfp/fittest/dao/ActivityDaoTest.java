package org.wfp.fittest.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;

public class ActivityDaoTest extends AbstractDaoTest {

	@Autowired
	private ActivityDao activityDao;

	@Autowired
	private UtilityDao utilityDao;

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testFindAllActivities() {
		List<Activity> activities = activityDao.findAllActivities();
		assertListSize(activities, 26);
	}

	@Test
	public void testFindActivityById() {
		Activity activity = activityDao.findActivityById(5);
		assertNotNull(activity);
		assertEquals(activity.getID(), new Integer(5));
		assertEquals(activity.getDescription(), "Somalia Electrical");
		assertNotNull(activity.getActivityType());
		assertEquals(activity.getActivityType().getID(), new Integer(4));
		assertEquals(activity.getActivityType().getActivityType(),
				"Installation");
	}

	@Test
	public void testFindActivitiesByActivityType() {
		ActivityType activityType = activityDao.findActivityTypeById(3);
		List<Activity> activities = activityDao
				.findActivitiesByActivityType(activityType);
		assertListSize(activities, 5);
	}

	@Test
	public void testFindActivitiesByDescription() {
		String description = "DMR Assessment";
		List<Activity> activities = activityDao
				.findActivitiesByDescription(description);
		assertListSize(activities, 3);
		String description2 = "Pakistan DMR";
		List<Activity> activities2 = activityDao
				.findActivitiesByDescription(description2);
		assertListSize(activities2, 1);
		assertEquals(activities2.get(0).getID(), new Integer(6));
	}

	@Test
	public void testDeleteActivity() {
		Activity activity = activityDao.findActivityById(2);
		activityDao.deleteActivity(activity);
		Activity activity2 = activityDao.findActivityById(2);
		assertNull(activity2);
	}
	
	@Test
	public void testSaveActivity() {
		ActivityType activityType = new ActivityType();
		activityType.setColorCode("abcdefgh");
		activityType.setActivityType("Testing123456789");
		activityDao.saveActivityType(activityType);

		Activity activity = new Activity();
		activity.setDescription("Testing");
		activity.setActivityType(activityType);
		activityDao.saveActivity(activity);

		List<Activity> activity2 = activityDao
				.findActivitiesByDescription("Testing");
		assertListSize(activity2, 1);
	}

	@Test
	public void testFindAllActivityRoles() {
		List<ActivityRole> ActivityRoles = activityDao.findAllActivityRoles();
		assertNotNull(ActivityRoles);
		assertEquals(ActivityRoles.size(), 48);
	}
}
