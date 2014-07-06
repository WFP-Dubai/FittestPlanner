package org.wfp.fittest.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.wfp.fittest.dao.ActivityDao;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.Event;

@Repository
public class ActivityDaoImpl extends AbstractDaoImpl implements ActivityDao {

	@Override
	public Activity findActivityById(Integer id) {
		return findById(Activity.class, id);
	}

	@Override
	public List<Activity> findAllActivities() {
		return findAll(Activity.class);
	}

	@Override
	public List<Activity> findActivitiesByActivityType(ActivityType activityType) {
		return findByPropertyEqual(Activity.class, "activityType", activityType);
	}

	@Override
	public List<Activity> findActivitiesByDescription(String description) {
		return findByPropertyEqual(Activity.class, "description", description);
	}

	@Override
	public void deleteActivity(Activity activity) {
		delete(activity);
	}

	@Override
	public void deleteActivityById(Integer id) {
		deleteById(Activity.class, id);
	}

	@Override
	public void deleteActivityByActivityType(ActivityType activityType) {
		deleteByPropertyEqual(Activity.class, "activityType", activityType);
	}

	@Override
	public void deleteActivitiesByDescription(String description) {
		deleteByPropertyEqual(Activity.class, "description", description);
	}

	@Override
	public void saveActivity(Activity activity) {
		saveOrUpdate(activity);
	}

	@Override
	public ActivityType findActivityTypeById(Integer id) {
		return findById(ActivityType.class, id);
	}

	@Override
	public List<ActivityType> findAllActivityTypes() {
		return findAll(ActivityType.class);
	}
	
	@Override
	public List<ActivityType> findActivityTypesByActivityType(
			String activityType) {
		return findByPropertyEqual(ActivityType.class, "activityType",
				activityType);
	}

	@Override
	public ActivityType findActivityTypeByActivityType(String activityType) {
		List<ActivityType> activityTypes = findActivityTypesByActivityType(activityType);
		if (activityTypes.size() == 0)
			return null;
		return activityTypes.get(0);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findActivityTypesWithStaffCount(Date startDate) {
		Query q = getCurrentSession().getNamedQuery("ActivityType.findWithStaffCount");
		q.setDate("startDate", startDate);
		return q.list();
	}
	
	@Override
	public List<ActivityType> findActivityTypesByColorCode(String colorCode) {
		return findByPropertyEqual(ActivityType.class, "colorCode", colorCode);
	}

	@Override
	public void deleteActivityType(ActivityType activityType) {
		delete(activityType);
	}

	@Override
	public void deleteActivityTypeById(Integer id) {
		deleteById(ActivityType.class, id);
	}

	@Override
	public void deleteAllActivityTypes() {
		deleteAll(ActivityType.class);
	}

	@Override
	public void deleteActivityTypesByActivityType(String activityType) {
		deleteByPropertyEqual(ActivityType.class, "activityType", activityType);
	}

	@Override
	public void deleteActivityTypesByColorCode(String colorCode) {
		deleteByPropertyEqual(ActivityType.class, "colorCode", colorCode);
	}

	@Override
	public void saveActivityType(ActivityType activityType) {
		saveOrUpdate(activityType);
	}

	@Override
	public ActivityRole findActivityRoleById(Integer id) {
		return findById(ActivityRole.class, id);
	}

	@Override
	public List<ActivityRole> findAllActivityRoles() {
		return findAll(ActivityRole.class);
	}

	@Override
	public List<ActivityRole> findActivityRolesAfterStartDate(Date startDate) {
		return findByStartDateAfter(ActivityRole.class, startDate);
	}

	@Override
	public List<ActivityRole> findActivityRolesBeforeEndDate(Date endDate) {
		return findByEndDateBefore(ActivityRole.class, endDate);
	}

	@Override
	public List<ActivityRole> findActivityRolesByDuration(Date startDate,
			Date endDate) {
		return findByDuration(ActivityRole.class, startDate, endDate);
	}

	@Override
	public List<ActivityRole> findActivityRolesByLocation(
			String activityRoleLocation) {
		return findByPropertyEqual(ActivityRole.class, "location",
				activityRoleLocation);
	}

	@Override
	public void deleteActivityRole(ActivityRole activityRole) {
		delete(activityRole);
	}

	@Override
	public void deleteActivityRoleById(Integer id) {
		deleteById(ActivityRole.class, id);
	}

	@Override
	public void deleteAllActivityRoles() {
		deleteAll(ActivityRole.class);
	}

	@Override
	public void deleteActivityRolesByLocation(String activityRoleLocation) {
		deleteByPropertyEqual(ActivityRole.class, "location",
				activityRoleLocation);
	}

	@Override
	public void saveActivityRole(ActivityRole activityRole) {
		saveOrUpdate(activityRole);
	}

	@Override
	public Event findEventById(Integer id) {
		return findById(Event.class, id);
	}

	@Override
	public List<Event> findAllEvents() {
		return findAll(Event.class);
	}

	@Override
	public List<Event> findEventsAfterStartDate(Date startDate) {
		return findByStartDateAfter(Event.class, startDate);
	}

	@Override
	public List<Event> findEventsBeforeEndDate(Date endDate) {
		return findByEndDateBefore(Event.class, endDate);
	}

	@Override
	public List<Event> findEventsByDuration(Date startDate, Date endDate) {
		return findByDuration(Event.class, startDate, endDate);
	}

	@Override
	public List<Event> findEventByName(String eventName) {
		return findByPropertyEqual(Event.class, "event", eventName);
	}

	@Override
	public void deleteEvent(Event event) {
		delete(event);
	}

	@Override
	public void deleteEventById(Integer id) {
		deleteById(Event.class, id);
	}

	@Override
	public void deleteAllEvents() {
		deleteAll(Event.class);
	}

	@Override
	public void deleteEventByName(String eventName) {
		deleteByPropertyEqual(Event.class, "event", eventName);
	}

	@Override
	public void saveEvent(Event event) {
		saveOrUpdate(event);
	}

}
