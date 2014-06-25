package org.wfp.fittest.beans;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.StaffType;

public class DeploymentCriteria {
	
	private Date startDate;
	private Date endDate;
	private List<Activity> activities;
	private List<StaffType> staffTypes;
	
	public DeploymentCriteria() {
		
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
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	public List<StaffType> getStaffTypes() {
		return staffTypes;
	}
	public void setStaffTypes(List<StaffType> staffTypes) {
		this.staffTypes = staffTypes;
	}
	
	
}
