package org.wfp.fittest.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "missions")
public class Mission {

	@Id
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "missionname", nullable = false)
	private String missionName;
	
	// FK
	@Column(name = "missionType")
	private MissionType missionType;
	
	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "startdate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;
}
