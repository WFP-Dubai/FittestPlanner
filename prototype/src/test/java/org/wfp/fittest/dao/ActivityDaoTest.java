package org.wfp.fittest.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.exception.ConstraintViolationException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;

public class ActivityDaoTest extends AbstractDaoTest {

	@Autowired
	private ActivityDao activityDao;

	@Autowired
	private StaffDao staffDao;
	
	@Autowired
	private UtilityDao utilityDao;

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
	public void testFindActivityTypesById() {
		ActivityType activityType = activityDao.findActivityTypeById(5);
		assertNotNull(activityType);
		assertEquals(activityType.getActivityType(), "Leave");
		assertEquals(activityType.getColorCode(), "FF3366");
	}

	@Test
	public void testFindallActivityTypes() {
		List<ActivityType> activityTypes = activityDao.findAllActivityTypes();
		assertListSize(activityTypes, 10);
	}

	@Test
	public void testFindActivityTypesByActivityType() {
		List<ActivityType> activityTypes = activityDao
				.findActivityTypesByActivityType("Installation");
		assertListSize(activityTypes, 1);
		ActivityType activityType = activityTypes.get(0);
		assertEquals(activityType.getID(), new Integer(4));
		assertEquals(activityType.getActivityType(), "Installation");
		assertEquals(activityType.getColorCode(), "6699FF");
	}

	@Test
	public void testFindActivityTypesByColorCode() {
		String colorCode = "FF3366";
		List<ActivityType> activityTypes = activityDao.findActivityTypesByColorCode(colorCode);
		assertListSize(activityTypes, 5);
		for (ActivityType activityType : activityTypes)
			assertEquals(activityType.getColorCode(), colorCode);
	}

	@Test
	public void testDeleteActivityType() {
		ActivityType activityType = activityDao.findActivityTypeById(2);
		assertNotNull(activityType);
		assertEquals(activityType.getActivityType(), "Emergency response");
		activityDao.deleteActivityType(activityType);
		ActivityType activityType2 = activityDao.findActivityTypeById(2);
		assertNull(activityType2);
	}

	@Test
	public void testDeleteActivityTypeById() {
		Integer id = 2;
		ActivityType activityType = activityDao.findActivityTypeById(id);
		assertNotNull(activityType);
		assertEquals(activityType.getActivityType(), "Emergency response");
		activityDao.deleteActivityTypeById(id);
		ActivityType activityType2 = activityDao.findActivityTypeById(id);
		assertNull(activityType2);
	}

	@Test(expected=ConstraintViolationException.class)
	public void testDeleteAllActivityTypes() {
		List<ActivityType> activityTypes = activityDao.findAllActivityTypes();
		assertListSize(activityTypes, 10);
		activityDao.deleteAllActivityTypes();
		List<ActivityType> activityTypes2 = activityDao.findAllActivityTypes();
		assertListSize(activityTypes2, 0);
	}

	@Test(expected=ConstraintViolationException.class)
	public void testDeleteActivityTypesByActivityType() {
		List<ActivityType> activityTypes = activityDao
				.findActivityTypesByActivityType("Installation");
		assertListSize(activityTypes, 1);
		activityDao.deleteActivityTypesByActivityType("Installation");
		List<ActivityType> activityTypes2 = activityDao
				.findActivityTypesByActivityType("Installation");
		assertListSize(activityTypes2, 0);
	}

	@Test(expected=ConstraintViolationException.class)
	public void testDeleteActivityTypesByColorCode() {
		String colorCode = "FF3366";
		List<ActivityType> activityTypes = activityDao.findActivityTypesByColorCode(colorCode);
		assertListSize(activityTypes, 5);
		activityDao.deleteActivityTypesByColorCode(colorCode);
		List<ActivityType> activityTypes2 = activityDao.findActivityTypesByColorCode(colorCode);
		assertListSize(activityTypes2, 0);
	}

	@Test
	public void testSaveActivityType() {
		ActivityType activityType = new ActivityType();
		activityType.setActivityType("Testing123");
		activityType.setColorCode("CDECDEF");
		activityDao.saveActivityType(activityType);
	}

	@Test
	public void testFindActivityRoleById() {
		ActivityRole activityRole = activityDao.findActivityRoleById(5);
		assertNotNull(activityRole);
		assertEquals(activityRole.getLocation(), "Bangui");
	}

	@Test
	public void testFindAllActivityRoles() {
		List<ActivityRole> activityRoles = activityDao.findAllActivityRoles();
		assertListSize(activityRoles, 48);
	}

	@Test
	public void testFindActivityRolesAfterStartDate() {
		Date startDate = new GregorianCalendar(2014, 0, 1, 0, 0, 0).getTime();
		List<ActivityRole> activityRoles = activityDao.findActivityRolesAfterStartDate(startDate);
		assertListSize(activityRoles, 10);
	}

	@Test
	public void testFindActivityRolesBeforeEndDate() {
		Date endDate = new GregorianCalendar(2014, 4, 1, 0, 0, 0).getTime();
		List<ActivityRole> activityRoles = activityDao.findActivityRolesBeforeEndDate(endDate);
		assertListSize(activityRoles, 10);
	}

	@Test
	public void testFindActivityRolesByDuration() {
		Date startDate = new GregorianCalendar(2014, 0, 1, 0, 0, 0).getTime();
		Date endDate = new GregorianCalendar(2014, 4, 1, 0, 0, 0).getTime();
		List<ActivityRole> activityRoles = activityDao.findActivityRolesByDuration(startDate, endDate);
		assertListSize(activityRoles, 8);
	}
	
	@Test
	public void testFindActivityRolesByLocation() {
		String location = "Bangui";
		List<ActivityRole> activityRoles = activityDao.findActivityRolesByLocation(location);
		assertListSize(activityRoles, 9);		
	}

	public void testDeleteActivityRole() {
		Integer id = 2;
		ActivityRole activityRole = activityDao.findActivityRoleById(id);
		assertNotNull(activityRole);
		activityDao.deleteActivityRole(activityRole);
		ActivityRole activityRole2 = activityDao.findActivityRoleById(id);
		assertNull(activityRole2);
	}

	public void testDeleteActivityRoleById() {
		Integer id = 2;
		ActivityRole activityRole = activityDao.findActivityRoleById(id);
		assertNotNull(activityRole);
		activityDao.deleteActivityRoleById(id);
		ActivityRole activityRole2 = activityDao.findActivityRoleById(id);
		assertNull(activityRole2);
	}

	@Test(expected=ConstraintViolationException.class)
	public void testDeleteAllActivityRoles() {
		List<ActivityRole> activityRoles = activityDao.findAllActivityRoles();
		assertListSize(activityRoles, 48);
		activityDao.deleteAllActivityRoles();
		List<ActivityRole> activityRoles2 = activityDao.findAllActivityRoles();
		assertListSize(activityRoles2, 0);
	}

	@Test(expected=ConstraintViolationException.class)
	public void testDeleteActivityRoleByLocation() {
		String location = "Bangui";
		List<ActivityRole> activityRoles = activityDao.findActivityRolesByLocation(location);
		assertListSize(activityRoles, 9);
		activityDao.deleteActivityRolesByLocation(location);
		List<ActivityRole> activityRoles2 = activityDao.findActivityRolesByLocation(location);
		assertListSize(activityRoles2, 0);
	}

	@Test
	public void testSaveActivityRole() {
		ActivityRole activityRole = new ActivityRole();
		activityRole.setStartDate(new Date());
		activityRole.setEndDate(new Date());
		activityRole.setLocation("Test123");
		activityRole.setActivity(activityDao.findActivityById(1));
		activityRole.setProfileType(staffDao.findAllProfileTypes().get(0));
		activityDao.saveActivityRole(activityRole);
		List<ActivityRole> activityRoles = activityDao.findActivityRolesByLocation("Test123");
		assertListSize(activityRoles, 1);
	}

	@Test
	public void testFindEventById() {

	}

	@Test
	public void testFindAllEvents() {

	}

	@Test
	public void testFindEventsAfterStartDate() {

	}

	@Test
	public void testFindEventsBeforeEndDate() {

	}

	@Test
	public void testFindEventsByDuration() {

	}

	@Test
	public void testDeleteEvents() {

	}

	@Test
	public void testDeleteEventById() {
		
	}

	@Test
	public void testDeleteAllEvents() {

	}

	@Test
	public void testDeleteEventByName() {

	}

	@Test
	public void testSaveEvent() {

	}

}