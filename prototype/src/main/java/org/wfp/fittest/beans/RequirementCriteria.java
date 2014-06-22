package org.wfp.fittest.beans;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.entity.Activity;

public class RequirementCriteria {

	private Date startDate;
	private Date endDate;
	private List<Activity> activities;
	
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
	
}
