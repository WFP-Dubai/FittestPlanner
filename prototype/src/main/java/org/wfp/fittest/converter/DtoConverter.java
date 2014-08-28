package org.wfp.fittest.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.dto.AbstractDto;
import org.wfp.fittest.dto.ActivityDto;
import org.wfp.fittest.dto.ActivityRoleDto;
import org.wfp.fittest.dto.ActivityTypeDto;
import org.wfp.fittest.dto.ConfirmedTypeDto;
import org.wfp.fittest.dto.CountryDto;
import org.wfp.fittest.dto.LanguageDto;
import org.wfp.fittest.dto.ProfileTypeDto;
import org.wfp.fittest.dto.StaffDto;
import org.wfp.fittest.dto.StaffRoleDto;
import org.wfp.fittest.dto.StaffTypeDto;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.EntityId;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;
import org.wfp.fittest.repository.ActivityRepository;
import org.wfp.fittest.repository.ActivityRoleRepository;
import org.wfp.fittest.repository.ActivityTypeRepository;
import org.wfp.fittest.repository.ConfirmedTypeRepository;
import org.wfp.fittest.repository.CountryRepository;
import org.wfp.fittest.repository.LanguageRepository;
import org.wfp.fittest.repository.ProfileTypeRepository;
import org.wfp.fittest.repository.StaffRepository;
import org.wfp.fittest.repository.StaffRoleRepository;
import org.wfp.fittest.repository.StaffTypeRepository;

import com.google.common.collect.Sets;

@Service
@Transactional(readOnly = true)
public class DtoConverter {

	@Autowired
	private ActivityRepository activityRepository;
	@Autowired
	private ActivityRoleRepository activityRoleRepository;
	@Autowired
	private ActivityTypeRepository activityTypeRepository;
	@Autowired
	private ConfirmedTypeRepository confirmedTypeRepository;
	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private ProfileTypeRepository profileTypeRepository;
	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private StaffRoleRepository staffRoleRepository;
	@Autowired
	private StaffTypeRepository staffTypeRepository;

	/*------------------------------------------------------------------------*
	 * Entity -> DTO                                                          *
	 *------------------------------------------------------------------------*/

	public <D extends AbstractDto, E extends EntityId> D entityToDto(E entity) {
		return EntityConverter.toBean(entity);
	}

	public <D extends AbstractDto, E extends EntityId> List<D> entitiesToDtos(
			Iterable<E> entities) {
		return EntityConverter.toBeanList(entities);
	}

	@SuppressWarnings("unchecked")
	public ActivityDto entityToDtoNested(Activity activity) {
		ActivityDto activityDto = entityToDto(activity);
		activityDto.setConfirmedTypeDto((ConfirmedTypeDto) entityToDto(activity
				.getConfirmedType()));
		activityDto.setActivityTypeDto((ActivityTypeDto) entityToDto(activity
				.getActivityType()));
		activityDto
				.setActivityRoleDtos((List<ActivityRoleDto>) (List<?>) entitiesToDtos(activity
						.getActivityRoles()));
		activityDto
				.setCountryDtos((List<CountryDto>) (List<?>) entitiesToDtos(activity
						.getCountries()));
		return activityDto;
	}

	@SuppressWarnings("unchecked")
	public ActivityRoleDto entityToDtoNested(ActivityRole activityRole) {
		ActivityRoleDto activityRoleDto = entityToDto(activityRole);
		activityRoleDto.setActivityDto((ActivityDto) entityToDto(activityRole
				.getActivity()));
		activityRoleDto
				.setProfileTypeDto((ProfileTypeDto) entityToDto(activityRole
						.getProfileType()));
		activityRoleDto
				.setStaffRoleDtos((List<StaffRoleDto>) (List<?>) entitiesToDtos(activityRole
						.getStaffRoles()));
		return activityRoleDto;
	}

	@SuppressWarnings("unchecked")
	public ActivityTypeDto entityToDtoNested(ActivityType activityType) {
		ActivityTypeDto activityTypeDto = entityToDto(activityType);
		activityTypeDto
				.setActivityDtos((List<ActivityDto>) (List<?>) entitiesToDtos(activityType
						.getActivities()));
		return activityTypeDto;
	}

	@SuppressWarnings("unchecked")
	public ConfirmedTypeDto entityToDtoNested(ConfirmedType confirmedType) {
		ConfirmedTypeDto confirmedTypeDto = entityToDto(confirmedType);
		confirmedTypeDto
				.setStaffRoleDtos((List<StaffRoleDto>) (List<?>) entitiesToDtos(confirmedType
						.getStaffRoles()));
		confirmedTypeDto
				.setActivityDtos((List<ActivityDto>) (List<?>) entitiesToDtos(confirmedType
						.getActivities()));
		return confirmedTypeDto;
	}

	@SuppressWarnings("unchecked")
	public CountryDto entityToDtoNested(Country country) {
		CountryDto countryDto = entityToDto(country);
		countryDto
				.setActivityDtos((List<ActivityDto>) (List<?>) entitiesToDtos(country
						.getActivities()));
		countryDto
				.setStaffByNationalityDtos((List<StaffDto>) (List<?>) entitiesToDtos(country
						.getStaffByNationality()));
		return countryDto;
	}

	@SuppressWarnings("unchecked")
	public LanguageDto entityToDtoNested(Language language) {
		LanguageDto languageDto = entityToDto(language);
		languageDto
				.setStaffByLanguageDtos((List<StaffDto>) (List<?>) entitiesToDtos(language
						.getStaffByLanguage()));
		return languageDto;
	}

	@SuppressWarnings("unchecked")
	public StaffDto entityToDtoNested(Staff staff) {
		StaffDto staffDto = entityToDto(staff);
		staffDto.setStaffTypeDto((StaffTypeDto) entityToDto(staff
				.getStaffType()));
		staffDto.setLanguageDtos((List<LanguageDto>) (List<?>) entitiesToDtos(staff
				.getLanguages()));
		staffDto.setNationalityDtos((List<CountryDto>) (List<?>) entitiesToDtos(staff
				.getNationalities()));
		staffDto.setProfileTypeDtos((List<ProfileTypeDto>) (List<?>) entitiesToDtos(staff
				.getProfileTypes()));
		staffDto.setStaffRoleDtos((List<StaffRoleDto>) (List<?>) entitiesToDtos(staff
				.getStaffRoles()));
		return staffDto;
	}

	@SuppressWarnings("unchecked")
	public StaffTypeDto entityToDtoNested(StaffType staffType) {
		StaffTypeDto staffTypeDto = entityToDto(staffType);
		staffTypeDto
				.setStaffDtos((List<StaffDto>) (List<?>) entitiesToDtos(staffType
						.getStaff()));
		return staffTypeDto;
	}

	@SuppressWarnings("unchecked")
	public ProfileTypeDto entityToDtoNested(ProfileType profileType) {
		ProfileTypeDto profileTypeDto = entityToDto(profileType);
		profileTypeDto
				.setStaffDtos((List<StaffDto>) (List<?>) entitiesToDtos(profileType
						.getStaff()));
		profileTypeDto
				.setActivityRoleDtos((List<ActivityRoleDto>) (List<?>) entitiesToDtos(profileType
						.getActivityRoles()));
		return profileTypeDto;
	}

	public List<StaffDto> entitiesToDtosNested(Iterable<Staff> staffList) {
		List<StaffDto> dtos = new ArrayList<>();
		for (Staff entity : staffList)
			dtos.add(entityToDtoNested(entity));
		return dtos;
	}

	public List<StaffRoleDto> entitiesToDtosNested_StaffRole(
			Iterable<StaffRole> staffRoles) {
		List<StaffRoleDto> dtos = new ArrayList<>();
		for (StaffRole entity : staffRoles)
			dtos.add(entityToDtoNested(entity));
		return dtos;
	}

	public StaffRoleDto entityToDtoNested(StaffRole staffRole) {
		StaffRoleDto staffRoleDto = entityToDto(staffRole);
		staffRoleDto.setActivityRoleDto((ActivityRoleDto) entityToDto(staffRole
				.getActivityRole()));
		staffRoleDto
				.setConfirmedTypeDto((ConfirmedTypeDto) entityToDto(staffRole
						.getConfirmedType()));
		staffRoleDto.setStaffDto((StaffDto) entityToDto(staffRole.getStaff()));
		return staffRoleDto;
	}

	/*------------------------------------------------------------------------*
	 * DTO -> Entity                                                          *
	 *------------------------------------------------------------------------*/

	public <E extends EntityId, D extends AbstractDto> E dtoToEntity(D dto) {
		return EntityConverter.toEntity(dto);
	}

	public <E extends EntityId, D extends AbstractDto> Set<E> dtosToEntities(
			Iterable<D> dtos) {
		return EntityConverter.toEntityList(dtos);
	}

	public Activity dtoToEntityNested(ActivityDto activityDto) {
		Activity activity = dtoToEntity(activityDto);
		activity.setActivityType(activityTypeRepository.findOne(activityDto
				.getActivityTypeId()));
		activity.setConfirmedType(confirmedTypeRepository.findOne(activityDto
				.getConfirmedTypeId()));
		activity.setCountries(Sets.newHashSet(countryRepository
				.findAll(activityDto.getCountryIds())));
		return activity;
	}

	public ActivityRole dtoToEntityNested(ActivityRoleDto activityRoleDto) {
		ActivityRole activityRole = dtoToEntity(activityRoleDto);
		activityRole.setActivity(activityRepository.findOne(activityRoleDto
				.getActivityId()));
		activityRole.setProfileType(profileTypeRepository
				.findOne(activityRoleDto.getProfileTypeId()));
		activityRole.setStaffRoles(Sets.newHashSet(staffRoleRepository
				.findAll(activityRoleDto.getStaffRoleIds())));
		return activityRole;
	}

	public ActivityType dtoToEntityNested(ActivityTypeDto activityTypeDto) {
		return dtoToEntity(activityTypeDto);
	}

	public ConfirmedType dtoToEntityNested(ConfirmedTypeDto confirmedTypeDto) {
		return dtoToEntity(confirmedTypeDto);
	}

	public Country dtoToEntityNested(CountryDto countryDto) {
		return dtoToEntity(countryDto);
	}

	public Language dtoToEntityNested(LanguageDto languageDto) {
		return dtoToEntity(languageDto);
	}

	public ProfileType dtoToEntityNested(ProfileTypeDto profileTypeDto) {
		return dtoToEntity(profileTypeDto);
	}

	public Staff dtoToEntityNested(StaffDto staffDto) {
		Staff staff = dtoToEntity(staffDto);
		staff.setStaffType(staffTypeRepository.findOne(staffDto
				.getStaffTypeId()));
		staff.setLanguages(Sets.newHashSet(languageRepository.findAll(staffDto
				.getLanguageIds())));
		staff.setNationalities(Sets.newHashSet(countryRepository
				.findAll(staffDto.getNationalityIds())));
		staff.setProfileTypes(Sets.newHashSet(profileTypeRepository
				.findAll(staffDto.getProfileTypeIds())));
		staff.setStaffRoles(Sets.newHashSet(staffRoleRepository
				.findAll(staffDto.getStaffRoleIds())));
		return staff;
	}

	public StaffRole dtoToEntityNested(StaffRoleDto staffRoleDto) {
		StaffRole staffRole = dtoToEntity(staffRoleDto);
		staffRole.setActivityRole(activityRoleRepository.findOne(staffRoleDto
				.getActivityRoleId()));
		staffRole.setConfirmedType(confirmedTypeRepository.findOne(staffRoleDto
				.getConfirmedTypeId()));
		staffRole.setStaff(staffRepository.findOne(staffRoleDto.getStaffId()));
		return staffRole;
	}

	public StaffType dtoToEntityNested(StaffTypeDto staffTypeDto) {
		return dtoToEntity(staffTypeDto);
	}

}
