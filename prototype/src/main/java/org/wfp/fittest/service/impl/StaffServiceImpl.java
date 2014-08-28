package org.wfp.fittest.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.converter.DtoConverter;
import org.wfp.fittest.dto.ProfileTypeDto;
import org.wfp.fittest.dto.StaffDto;
import org.wfp.fittest.dto.StaffRoleDto;
import org.wfp.fittest.dto.StaffTypeDto;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;
import org.wfp.fittest.repository.ProfileTypeRepository;
import org.wfp.fittest.repository.StaffRepository;
import org.wfp.fittest.repository.StaffRoleRepository;
import org.wfp.fittest.repository.StaffTypeRepository;
import org.wfp.fittest.service.StaffService;

@Service
@Transactional(readOnly = true)
public class StaffServiceImpl implements StaffService {

	@Autowired
	private DtoConverter converter;

	@Resource
	private StaffRepository staffRepository;
	@Resource
	private StaffRoleRepository staffRoleRepository;
	@Resource
	private StaffTypeRepository staffTypeRepository;
	@Resource
	private ProfileTypeRepository profileTypeRepository;

	@Override
	public StaffDto findStaffById(Long staffId) {
		return converter.entityToDto(staffRepository.findOne(staffId));
	}

	@Override
	public StaffDto findStaffNested(Long staffId) {
		return converter.entityToDtoNested(staffRepository.findOne(staffId));
	}

	@Override
	public List<StaffDto> findStaffByActivityTypeInDate(String activityType,
			Date date) {
		return converter.entitiesToDtosNested(staffRepository
				.findByActivityTypeInDate(activityType, date));
	}

	@Override
	public List<StaffDto> findStaffBIS(Date date) {
		return findStaffByActivityTypeInDate("Break in Service", date);
	}

	@Override
	public List<StaffDto> findStaffAvailable(Date date) {
		return converter.entitiesToDtosNested(staffRepository
				.findByAvailableInDate(date));
	}

	@Override
	public List<StaffDto> findStaffNotAvailable(Date date) {
		return converter.entitiesToDtosNested(staffRepository
				.findByNotAvailableInDate(date));
	}

	@Override
	public List<StaffDto> findAllStaff() {
		return converter.entitiesToDtos(staffRepository.findAll());
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteStaffById(Long staffId) {
		staffRepository.delete(staffId);
		return true;
	}

	@Override
	@Transactional(readOnly = false)
	public StaffDto saveOrUpdateStaff(StaffDto staffDto) {
		Staff staff = converter.dtoToEntityNested(staffDto);
		return converter.entityToDtoNested(staffRepository.save(staff));
	}

	@Override
	public StaffRoleDto findStaffRoleNested(Long staffRoleId) {
		return converter.entityToDtoNested(staffRoleRepository
				.findOne(staffRoleId));
	}

	@Override
	@Transactional(readOnly = false)
	public StaffRoleDto saveOrUpdateStaffRole(StaffRoleDto staffRoleDto) {
		StaffRole staffRole = converter.dtoToEntityNested(staffRoleDto);
		return converter.entityToDtoNested(staffRoleRepository.save(staffRole));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteStaffRoleById(Long staffRoleId) {
		staffRoleRepository.delete(staffRoleId);
		return true;
	}

	@Override
	public List<StaffRoleDto> findAllStaffRoles() {
		return converter.entitiesToDtos(staffRoleRepository.findAll());
	}

	@Override
	public List<ProfileTypeDto> findAllProfileTypes() {
		return converter.entitiesToDtos(profileTypeRepository.findAll());
	}

	@Override
	public List<StaffTypeDto> findAllStaffTypes() {
		return converter.entitiesToDtos(staffTypeRepository.findAll());
	}

	@Override
	public Map<String, Long> countStaffByStaffType() {
		Map<String, Long> result = new HashMap<>();
		for (Object item : staffRepository.countByStaffType()) {
			Object[] tuple = (Object[]) item;
			Long id = ((Long) tuple[0]);
			String staffType = staffTypeRepository.findOne(id).getStaffType();
			Long value = (Long) tuple[1];
			result.put(staffType, value);
		}
		return result;
	}

	@Override
	public Map<String, Long> countStaffByProfileType() {
		Map<String, Long> result = new HashMap<>();
		for (ProfileType pt : profileTypeRepository.findAll()) {
			result.put(pt.getProfileType(), Long.valueOf(pt.getStaff().size()));
		}
		return result;
	}

	@Override
	public Map<String, Long> countStaffAvailability(Date date) {
		Map<String, Long> result = new HashMap<>();
		result.put("Available",
				Long.valueOf(this.findStaffAvailable(date).size()));
		result.put("Not Available",
				Long.valueOf(this.findStaffNotAvailable(date).size()));
		result.put("Staff BIS", Long.valueOf(this.findStaffBIS(date).size()));
		return result;
	}

	@Override
	public List<StaffRoleDto> findStaffRolesBIS(Date date) {
		return converter.entitiesToDtosNested_StaffRole(staffRoleRepository
				.findByActivityTypeInDate("Break in Service", date));
	}

	@Override
	public List<StaffRoleDto> findStaffRolesNotAvailable(Date date) {
		return converter.entitiesToDtosNested_StaffRole(staffRoleRepository
				.findByNotAvailableInDate(date));
	}

	@Override
	public StaffTypeDto findStaffTypeNested(Long staffTypeId) {
		return converter.entityToDtoNested(staffTypeRepository
				.findOne(staffTypeId));
	}

	@Override
	@Transactional(readOnly = false)
	public StaffTypeDto saveOrUpdateStaffType(StaffTypeDto staffTypeDto) {
		StaffType staffType = converter.dtoToEntityNested(staffTypeDto);
		return converter.entityToDtoNested(staffTypeRepository.save(staffType));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteStaffTypeById(Long staffTypeId) {
		staffTypeRepository.delete(staffTypeId);
		return true;
	}

	@Override
	public ProfileTypeDto findProfileTypeNested(Long profileTypeId) {
		return converter.entityToDtoNested(profileTypeRepository
				.findOne(profileTypeId));
	}

	@Override
	@Transactional(readOnly = false)
	public ProfileTypeDto saveOrUpdateProfileType(ProfileTypeDto profileTypeDto) {
		ProfileType profileType = converter.dtoToEntityNested(profileTypeDto);
		return converter.entityToDtoNested(profileTypeRepository.save(profileType));
	}

	@Override
	@Transactional(readOnly = false)
	public boolean deleteProfileTypeById(Long profileTypeId) {
		profileTypeRepository.delete(profileTypeId);
		return true;
	}

}
