package org.wfp.fittest.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.wfp.fittest.dto.ProfileTypeDto;
import org.wfp.fittest.dto.StaffDto;
import org.wfp.fittest.dto.StaffRoleDto;
import org.wfp.fittest.dto.StaffTypeDto;

public interface StaffService {

	public StaffDto findStaffById(Long staffId);

	public StaffDto findStaffNested(Long staffId);

	public List<StaffDto> findAllStaff();

	public List<StaffDto> findStaffByActivityTypeInDate(String activityType,
			Date date);

	public List<StaffDto> findStaffBIS(Date date);

	public List<StaffDto> findStaffAvailable(Date date);

	public List<StaffDto> findStaffNotAvailable(Date date);

	public StaffDto saveOrUpdateStaff(StaffDto staffDto);

	public boolean deleteStaffById(Long staffId);

	public StaffRoleDto findStaffRoleNested(Long staffRoleId);

	public boolean deleteStaffRoleById(Long staffRoleId);

	public StaffRoleDto saveOrUpdateStaffRole(StaffRoleDto staffRoleDto);

	public List<StaffRoleDto> findAllStaffRoles();
	
	public List<StaffRoleDto> findStaffRolesBIS(Date date);
	
	public List<StaffRoleDto> findStaffRolesNotAvailable(Date date);

	public List<StaffTypeDto> findAllStaffTypes();
	
	public StaffTypeDto findStaffTypeNested(Long staffTypeId);
	
	public StaffTypeDto saveOrUpdateStaffType(StaffTypeDto staffTypeDto);
	
	public boolean deleteStaffTypeById(Long staffTypeId);

	public List<ProfileTypeDto> findAllProfileTypes();
	
	public ProfileTypeDto findProfileTypeNested(Long profileTypeId);
	
	public ProfileTypeDto saveOrUpdateProfileType(ProfileTypeDto profileTypeDto);
	
	public boolean deleteProfileTypeById(Long profileTypeId);
	
	public Map<String, Long> countStaffByStaffType();

	public Map<String, Long> countStaffByProfileType();

	public Map<String, Long> countStaffAvailability(Date date);

}
