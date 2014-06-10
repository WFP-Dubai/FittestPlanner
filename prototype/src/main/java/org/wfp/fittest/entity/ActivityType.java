package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activitytypes")
public class ActivityType {

	@Id
	@Column(name = "activity")
	private String activity;
	
	@Column(name = "colorcode")
	private String colorCode;
}
