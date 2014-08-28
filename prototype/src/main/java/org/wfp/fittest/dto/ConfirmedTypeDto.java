package org.wfp.fittest.dto;

import java.util.ArrayList;
import java.util.List;

public class ConfirmedTypeDto extends AbstractDto {
	private Long id;
	private String confirmedType;
	private String confirmedColorCode;

	private List<StaffRoleDto> staffRoleDtos = new ArrayList<StaffRoleDto>();
	private List<ActivityDto> activityDtos = new ArrayList<ActivityDto>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConfirmedType() {
		return confirmedType;
	}

	public void setConfirmedType(String confirmedType) {
		this.confirmedType = confirmedType;
	}

	public String getConfirmedColorCode() {
		return confirmedColorCode;
	}

	public void setConfirmedColorCode(String confirmedColorCode) {
		this.confirmedColorCode = confirmedColorCode;
	}

	public List<StaffRoleDto> getStaffRoleDtos() {
		return staffRoleDtos;
	}

	public void setStaffRoleDtos(List<StaffRoleDto> staffRoleDtos) {
		this.staffRoleDtos = staffRoleDtos;
	}

	public List<ActivityDto> getActivityDtos() {
		return activityDtos;
	}

	public void setActivityDtos(List<ActivityDto> activityDtos) {
		this.activityDtos = activityDtos;
	}

	@Override
	public String toString() {
		return confirmedType;
	}
}
