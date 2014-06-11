package org.wfp.fittest.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "missions")
public class Mission {

	@Id
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "missionname", nullable = false)
	private String missionName;
	
	@ManyToOne
	@Column(name = "missiontype")
	private MissionType missionType;
	
	@ManyToMany
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "id")},
		inverseJoinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "id")}
	)
	private List<Activity> activities;

	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "startdate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;
}
