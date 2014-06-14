package org.wfp.fittest.entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "missionid")},
		inverseJoinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")}
	)
	private Set<Activity> activities;

	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "startdate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;

	public Mission() {}
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getMissionName() {
		return missionName;
	}

	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}

	public MissionType getMissionType() {
		return missionType;
	}

	public void setMissionType(MissionType missionType) {
		this.missionType = missionType;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getStartDate() {
		return startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
}
