package org.wfp.fittest.beans;

public class ActivitySummary {

	public ActivitySummary() {}
	
	private String activityType;
	
	private Long numberOfStaff;
	
	private Long numberOfConfirmed;

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public Long getNumberOfStaff() {
		return numberOfStaff;
	}

	public void setNumberOfStaff(Long numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}

	public Long getNumberOfConfirmed() {
		return numberOfConfirmed;
	}

	public void setNumberOfConfirmed(Long numberOfConfirmed) {
		this.numberOfConfirmed = numberOfConfirmed;
	}

}
