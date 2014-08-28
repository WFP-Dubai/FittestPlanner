package org.wfp.fittest.dto;

import java.util.ArrayList;
import java.util.List;

public class ProfileTypeDto extends AbstractDto {
	private Long id;
	private String profileType;

	private List<StaffDto> staffDtos = new ArrayList<>();
	private List<ActivityRoleDto> activityRoleDtos = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public List<StaffDto> getStaffDtos() {
		return staffDtos;
	}

	public void setStaffDtos(List<StaffDto> staffDtos) {
		this.staffDtos = staffDtos;
	}

	public List<ActivityRoleDto> getActivityRoleDtos() {
		return activityRoleDtos;
	}

	public void setActivityRoleDtos(List<ActivityRoleDto> activityRoleDtos) {
		this.activityRoleDtos = activityRoleDtos;
	}

	@Override
	public String toString() {
		return profileType;
	}
}
