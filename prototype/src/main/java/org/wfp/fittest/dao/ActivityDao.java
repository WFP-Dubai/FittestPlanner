package org.wfp.fittest.dao;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Event;

public interface ActivityDao {

	/* ====================================================================== */
	// Activity
	/* ====================================================================== */

	public Activity findActivityById(Integer id);

	public List<Activity> findAllActivities();
	
	public List<Activity> findActivitiesByConfirmedType(ConfirmedType confirmedType);

	public List<Activity> findActivitiesByActivityType(ActivityType activityType);

	public List<Activity> findActivitiesByDescription(String description);

	public void deleteActivity(Activity activity);

	public void deleteActivityById(Integer id);

	public void deleteActivityByActivityType(ActivityType activityType);

	public void deleteActivitiesByDescription(String description);

	public void saveActivity(Activity activity);

	/* ====================================================================== */
	// Activity Type
	/* ====================================================================== */

	public ActivityType findActivityTypeById(Integer id);

	public List<ActivityType> findAllActivityTypes();

	public ActivityType findActivityTypeByActivityType(String activityType);
	
	public List<ActivityType> findActivityTypesByActivityType(
			String activityType);

	public List<Object[]> findActivityTypesWithStaffCount(Date startDate);
	
	public List<ActivityType> findActivityTypesByColorCode(String colorCode);

	public void deleteActivityType(ActivityType activityType);

	public void deleteActivityTypeById(Integer id);

	public void deleteAllActivityTypes();

	public void deleteActivityTypesByActivityType(String activityType);

	public void deleteActivityTypesByColorCode(String colorCode);

	public void saveActivityType(ActivityType activityType);

	/* ====================================================================== */
	// Activity Role
	/* ====================================================================== */

	public ActivityRole findActivityRoleById(Integer id);

	public List<ActivityRole> findAllActivityRoles();

	public List<ActivityRole> findActivityRolesAfterStartDate(Date startDate);

	public List<ActivityRole> findActivityRolesBeforeEndDate(Date endDate);

	public List<ActivityRole> findActivityRolesByDuration(Date startDate,
			Date endDate);

	public List<ActivityRole> findActivityRolesByLocation(
			String activityRoleLocation);

	public void deleteActivityRole(ActivityRole activityRole);

	public void deleteActivityRoleById(Integer id);

	public void deleteAllActivityRoles();

	public void deleteActivityRolesByLocation(String activityRoleLocation);

	public void saveActivityRole(ActivityRole activityRole);

	/* ====================================================================== */
	// Event
	/* ====================================================================== */

	public Event findEventById(Integer id);

	public List<Event> findAllEvents();

	public List<Event> findEventsAfterStartDate(Date startDate);

	public List<Event> findEventsBeforeEndDate(Date endDate);

	public List<Event> findEventsByDuration(Date startDate, Date endDate);

	public List<Event> findEventByName(String eventName);

	public void deleteEvent(Event event);

	public void deleteEventById(Integer id);

	public void deleteAllEvents();

	public void deleteEventByName(String eventName);

	public void saveEvent(Event event);
}
