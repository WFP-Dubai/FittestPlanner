package org.wfp.fittest.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "activitytypes")
public class ActivityType {

	@Id
	@Column(name = "activitytypeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "activitytype")
	private String activityType;
	
	@Column(name = "colorcode")
	private String colorCode;
	
	@OneToMany(mappedBy = "activityType")
	private Set<Activity> activities;
}
