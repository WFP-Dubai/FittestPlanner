package org.wfp.fittest.service;

import java.util.List;

import org.wfp.fittest.dto.ActivityDto;
import org.wfp.fittest.dto.ActivityRoleDto;
import org.wfp.fittest.dto.ActivityTypeDto;
import org.wfp.fittest.dto.EventDto;

public interface ActivityService {
	
	// Activity
	
	public ActivityDto findActivity(Long activityId);
	
	public ActivityDto findActivityNested(Long activityId);
	
	public List<ActivityDto> findAllActivities();
	
	public boolean deleteActivity(ActivityDto activityDto);
	
	public boolean deleteActivityById(Long activityId);
	
	public ActivityDto saveOrUpdateActivity(ActivityDto activityDto);

	// Activity Role
	
	public List<ActivityRoleDto> findAllActivityRoles();
	
	public ActivityRoleDto findActivityRole(Long activityRoleId);
	
	public ActivityRoleDto findActivityRoleNested(Long activityRoleId);

	public boolean deleteActivityRole(ActivityRoleDto activityRoleDto);
	
	public boolean deleteActivityRoleById(Long activityRoleId);

	public ActivityRoleDto saveOrUpdateActivityRole(ActivityRoleDto activityRoleDto);
	
	// Activity Type
	
	public List<ActivityTypeDto> findAllActivityTypes();
	
	public ActivityTypeDto findActivityType(Long activityTypeId);
	
	public ActivityTypeDto findActivityTypeNested(Long activityTypeId);
	
	public boolean deleteActivityType(ActivityTypeDto activityTypeDto);
	
	public boolean deleteActivityTypeById(Long activityTypeId);
	
	public ActivityTypeDto saveOrUpdateActivityType(ActivityTypeDto activityTypeDto);
	
	// Event
	
	public List<EventDto> findAllEvents();
	
	public EventDto findEventNested(Long eventId);
	
	public boolean deleteEventById(Long eventId);

	public EventDto saveOrUpdateEvent(EventDto eventDto);
}
