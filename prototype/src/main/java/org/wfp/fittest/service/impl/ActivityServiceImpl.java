package org.wfp.fittest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.converter.DtoConverter;
import org.wfp.fittest.dto.ActivityDto;
import org.wfp.fittest.dto.ActivityRoleDto;
import org.wfp.fittest.dto.ActivityTypeDto;
import org.wfp.fittest.dto.EventDto;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.Event;
import org.wfp.fittest.repository.ActivityRepository;
import org.wfp.fittest.repository.ActivityRoleRepository;
import org.wfp.fittest.repository.ActivityTypeRepository;
import org.wfp.fittest.repository.EventRepository;
import org.wfp.fittest.service.ActivityService;

@Service
@Transactional(readOnly = true)
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	private DtoConverter converter;

	@Autowired
	private ActivityRepository activityRepository;
	@Autowired
	private ActivityRoleRepository activityRoleRepository;
	@Autowired
	private ActivityTypeRepository activityTypeRepository;
	@Autowired
	private EventRepository eventRepository;

	@Override
	public List<ActivityDto> findAllActivities() {
		return converter.entitiesToDtos(activityRepository.findAll());
	}

	@Override
	public ActivityDto findActivity(Long activityId) {
		return converter.entityToDto(activityRepository.findOne(activityId));
	}

	@Override
	public ActivityDto findActivityNested(Long activityId) {
		return converter.entityToDtoNested(activityRepository
				.findOne(activityId));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteActivity(ActivityDto activityDto) {
		return deleteActivityById(activityDto.getId());
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteActivityById(Long activityId) {
		activityRepository.delete(activityId);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public ActivityDto saveOrUpdateActivity(ActivityDto activityDto) {
		Activity activity = converter.dtoToEntityNested(activityDto);
		return converter.entityToDtoNested(activityRepository.save(activity));
	}

	@Override
	public List<ActivityRoleDto> findAllActivityRoles() {
		return converter.entitiesToDtos(activityRoleRepository.findAll());
	}

	@Override
	public ActivityRoleDto findActivityRole(Long activityRoleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivityRoleDto findActivityRoleNested(Long activityRoleId) {
		return converter.entityToDtoNested(activityRoleRepository
				.findOne(activityRoleId));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteActivityRole(ActivityRoleDto activityRoleDto) {
		return deleteActivityRoleById(activityRoleDto.getId());
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteActivityRoleById(Long activityRoleId) {
		activityRoleRepository.delete(activityRoleId);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public ActivityRoleDto saveOrUpdateActivityRole(
			ActivityRoleDto activityRoleDto) {
		ActivityRole activityRole = converter
				.dtoToEntityNested(activityRoleDto);
		return converter.entityToDtoNested(activityRoleRepository
				.save(activityRole));
	}

	@Override
	public List<ActivityTypeDto> findAllActivityTypes() {
		return converter.entitiesToDtos(activityTypeRepository.findAll());
	}

	@Override
	public ActivityTypeDto findActivityType(Long activityTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ActivityTypeDto findActivityTypeNested(Long activityTypeId) {
		return converter.entityToDtoNested(activityTypeRepository
				.findOne(activityTypeId));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteActivityType(ActivityTypeDto activityTypeDto) {
		return deleteActivityTypeById(activityTypeDto.getId());
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteActivityTypeById(Long activityTypeId) {
		activityTypeRepository.delete(activityTypeId);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public ActivityTypeDto saveOrUpdateActivityType(
			ActivityTypeDto activityTypeDto) {
		ActivityType activityType = converter.dtoToEntityNested(activityTypeDto);
		return converter.entityToDtoNested(activityTypeRepository.save(activityType));
	}

	@Override
	public List<EventDto> findAllEvents() {
		return converter.entitiesToDtos(eventRepository.findAll());
	}

	@Override
	public EventDto findEventNested(Long eventId) {
		return converter.entityToDto(eventRepository.findOne(eventId));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteEventById(Long eventId) {
		eventRepository.delete(eventId);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public EventDto saveOrUpdateEvent(EventDto eventDto) {
		Event event = converter.dtoToEntity(eventDto);
		return converter.entityToDto(eventRepository.save(event));
	}

}
