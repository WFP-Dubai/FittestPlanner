package org.wfp.fittest.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.Mission;
import org.wfp.fittest.entity.MissionType;

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

	@Test
	public void testDeleteAllActivityTypes() {
		List<ActivityType> activityTypes = activityDao.findAllActivityTypes();
		assertListSize(activityTypes, 10);
		activityDao.deleteAllActivityTypes();
		List<ActivityType> activityTypes2 = activityDao.findAllActivityTypes();
		assertListSize(activityTypes2, 0);
	}

	@Test
	public void testDeleteActivityTypesByActivityType() {
		List<ActivityType> activityTypes = activityDao
				.findActivityTypesByActivityType("Installation");
		assertListSize(activityTypes, 1);
		activityDao.deleteActivityTypesByActivityType("Installation");
		List<ActivityType> activityTypes2 = activityDao
				.findActivityTypesByActivityType("Installation");
		assertListSize(activityTypes2, 0);
	}

	@Test
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

	@Test
	public void testDeleteActivityRole() {
		Integer id = 2;
		ActivityRole activityRole = activityDao.findActivityRoleById(id);
		assertNotNull(activityRole);
		activityDao.deleteActivityRole(activityRole);
		ActivityRole activityRole2 = activityDao.findActivityRoleById(id);
		assertNull(activityRole2);
	}

	@Test
	public void testDeleteActivityRoleById() {
		Integer id = 2;
		ActivityRole activityRole = activityDao.findActivityRoleById(id);
		assertNotNull(activityRole);
		activityDao.deleteActivityRoleById(id);
		ActivityRole activityRole2 = activityDao.findActivityRoleById(id);
		assertNull(activityRole2);
	}

	@Test
	public void testDeleteAllActivityRoles() {
		List<ActivityRole> activityRoles = activityDao.findAllActivityRoles();
		assertListSize(activityRoles, 48);
		activityDao.deleteAllActivityRoles();
		List<ActivityRole> activityRoles2 = activityDao.findAllActivityRoles();
		assertListSize(activityRoles2, 0);
	}

	@Test
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
	public void testFindMissionById() {
		Mission mission = activityDao.findMissionById(1);
		assertNotNull(mission);
		assertEquals(mission.getMissionLocation(), "CAR");
	}

	@Test
	public void testFindAllMissions() {
		List<Mission> missions = activityDao.findAllMissions();
		assertListSize(missions, 5);
	}

	@Test
	public void testFindMissionsAfterStartDate() {
		Date startDate = new GregorianCalendar(2014, 0, 1, 0, 0, 0).getTime();
		List<Mission> missions = activityDao.findMissionsAfterStartDate(startDate);
		assertListSize(missions, 2);
	}

	@Test
	public void testFindMissionBeforeEndDate() {
		Date endDate = new GregorianCalendar(2014, 1, 1, 0, 0, 0).getTime();
		List<Mission> missions = activityDao.findMissionsBeforeEndDate(endDate);
		assertListSize(missions, 3);
	}

	@Test
	public void testFindMissionsByDuration() {
		Date startDate = new GregorianCalendar(2014, 0, 1, 0, 0, 0).getTime();
		Date endDate = new GregorianCalendar(2014, 4, 1, 0, 0, 0).getTime();
		List<Mission> missions = activityDao.findMissionsByDuration(startDate, endDate);
		assertListSize(missions, 2);
	}

	@Test
	public void testFindMissionsByLocation() {
		String location = "Testing 123";
		List<Mission> missions = activityDao.findMissionsByLocation(location);
		assertListSize(missions, 1);
		assertEquals(missions.get(0).getMissionLocation(), location);
	}

	@Test
	public void testFindMissionsByName() {
		String name = "Mission 4";
		List<Mission> missions = activityDao.findMissionsByName(name);
		assertListSize(missions, 1);
		assertEquals(missions.get(0).getMissionName(), name);
	}

	@Test
	public void testFindMissionsByMissionType() {
		MissionType missionType = activityDao.findMissionTypeById(3);
		List<Mission> missions = activityDao.findMissionsByMissionType(missionType);
		assertListSize(missions, 2);
	}

	@Test
	public void testDeleteMission() {
		Mission mission = activityDao.findMissionById(1);
		assertNotNull(mission);
		activityDao.deleteMission(mission);
		mission = activityDao.findMissionById(1);
		assertNull(mission);
	}

	@Test
	public void testDeleteMissionById() {
		Integer id = 1;
		Mission mission = activityDao.findMissionById(id);
		assertNotNull(mission);
		activityDao.deleteMissionById(id);
		mission = activityDao.findMissionById(id);
		assertNull(mission);
	}

	@Test
	public void testDeleteAllMissions() {
		List<Mission> missions = activityDao.findAllMissions();
		assertListSize(missions, 5);
		activityDao.deleteAllMissions();
		missions = activityDao.findAllMissions();
		assertListSize(missions, 0);
	}

	@Test
	public void testDeleteMissionsByLocation() {
		String location = "Testing 123";
		List<Mission> missions = activityDao.findMissionsByLocation(location);
		assertListSize(missions, 1);
		activityDao.deleteMissionsByLocation(location);
		missions = activityDao.findMissionsByLocation(location);
		assertListSize(missions, 0);
	}

	@Test
	public void testDeleteMissionsByName() {
		String name = "Mission 4";
		List<Mission> missions = activityDao.findMissionsByName(name);
		assertListSize(missions, 1);
		activityDao.deleteMissionsByName(name);
		missions = activityDao.findMissionsByName(name);
		assertListSize(missions, 0);
	}

	@Test
	public void testDeleteMissionsByMissionType() {
		MissionType missionType = activityDao.findMissionTypeById(3);
		List<Mission> missions = activityDao.findMissionsByMissionType(missionType);
		assertListSize(missions, 2);
		activityDao.deleteMissionsByMissionType(missionType);
		missions = activityDao.findMissionsByMissionType(missionType);
		assertListSize(missions, 0);
	}

	@Test
	public void testSaveMission() {

	}

	@Test
	public void testFindMissionTypeById() {

	}

	@Test
	public void testFindAllMissionTypes() {

	}

	@Test
	public void testDeleteMissionType() {

	}

	@Test
	public void testDeleteMissionTypeById() {

	}

	@Test
	public void testSaveMissionType() {

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