package org.wfp.fittest.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "activityroles")
public class ActivityRole {

	@Id
	@Column(name = "activityroleid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@ManyToOne
	@JoinColumn(name = "activityid")
	private Activity activity;
	
	@ManyToOne
	@JoinColumn(name = "profiletypeid")
	private ProfileType profileType;
	
	@Column(name = "startdate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;
	
	@Column(name = "location")
	private String location;
}
