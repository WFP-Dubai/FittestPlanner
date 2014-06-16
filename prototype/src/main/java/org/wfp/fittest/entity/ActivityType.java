package org.wfp.fittest.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "activitytypes")
public class ActivityType {

	@Id
	@Column(name = "activitytypeid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="activitytypes_activitytypeid_seq", name="activitytypes_activitytypeid_seq")
	@GeneratedValue(generator="activitytypes_activitytypeid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "activitytype")
	private String activityType;
	
	@Column(name = "colorcode")
	private String colorCode;
	
	@OneToMany(mappedBy = "activityType")
	private Set<Activity> activities;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
	
}
