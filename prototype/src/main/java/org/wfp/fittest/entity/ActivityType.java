package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "activitytypes")
public class ActivityType {

	@Id
	@Column(name = "activitytype")
	private String activityType;
	
	@Column(name = "colorcode")
	private String colorCode;
	
	@OneToMany(mappedBy = "activitytype")
	private List<Activity> activities;
}
