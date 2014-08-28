package org.wfp.fittest.dto;

import java.util.Date;

public class StaffRoleDto extends AbstractDto {
	private Long id;
	private Date startDate;
	private Date endDate;
	private String location;
	private String comments;

	private Long activityRoleId;
	private Long confirmedTypeId;
	private Long staffId;
	
	private ActivityRoleDto activityRoleDto;
	private ConfirmedTypeDto confirmedTypeDto;
	private StaffDto staffDto;

	private String confirmedTypeDescription;
	private String confirmedTypeColorCode;
	private String activityRoleDescription;
	private String activityRoleProfileTypeDescription;
	private String staffFirstName;
	private String staffLastName;
	private String staffName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	public Long getActivityRoleId() {
		return activityRoleId;
	}

	public void setActivityRoleId(Long activityRoleId) {
		this.activityRoleId = activityRoleId;
	}

	public Long getConfirmedTypeId() {
		return confirmedTypeId;
	}

	public void setConfirmedTypeId(Long confirmedTypeId) {
		this.confirmedTypeId = confirmedTypeId;
	}

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public ActivityRoleDto getActivityRoleDto() {
		return activityRoleDto;
	}

	public void setActivityRoleDto(ActivityRoleDto activityRoleDto) {
		this.activityRoleDto = activityRoleDto;
	}

	public ConfirmedTypeDto getConfirmedTypeDto() {
		return confirmedTypeDto;
	}

	public void setConfirmedTypeDto(ConfirmedTypeDto confirmedTypeDto) {
		this.confirmedTypeDto = confirmedTypeDto;
	}

	public StaffDto getStaffDto() {
		return staffDto;
	}

	public void setStaffDto(StaffDto staffDto) {
		this.staffDto = staffDto;
	}

	public String getConfirmedTypeDescription() {
		return confirmedTypeDescription;
	}

	public void setConfirmedTypeDescription(String confirmedTypeDescription) {
		this.confirmedTypeDescription = confirmedTypeDescription;
	}

	public String getConfirmedTypeColorCode() {
		return confirmedTypeColorCode;
	}

	public void setConfirmedTypeColorCode(String confirmedTypeColorCode) {
		this.confirmedTypeColorCode = confirmedTypeColorCode;
	}

	public String getActivityRoleDescription() {
		return activityRoleDescription;
	}

	public void setActivityRoleDescription(String activityRoleDescription) {
		this.activityRoleDescription = activityRoleDescription;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getActivityRoleProfileTypeDescription() {
		return activityRoleProfileTypeDescription;
	}

	public void setActivityRoleProfileTypeDescription(
			String activityRoleProfileTypeDescription) {
		this.activityRoleProfileTypeDescription = activityRoleProfileTypeDescription;
	}

	@Override
	public String toString() {
		return activityRoleProfileTypeDescription;
	}
}
