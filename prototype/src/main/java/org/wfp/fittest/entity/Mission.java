package org.wfp.fittest.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@Column(name = "missionid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "missionname", nullable = false)
	private String missionName;
	
	@ManyToOne
	@JoinColumn(name = "missiontypeid")
	private MissionType missionType;
	
	@ManyToMany
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "missionid")},
		inverseJoinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")}
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
