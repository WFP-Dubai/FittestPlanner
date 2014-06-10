package org.wfp.fittest.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {

	@Id
	@Column(name = "id")
	private Integer ID;
	
	// FK
	@Column(name = "activityid")
	private Activity activity;
	
	@Column(name = "startdate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;
	
	@Column(name = "location")
	private String location;
}
