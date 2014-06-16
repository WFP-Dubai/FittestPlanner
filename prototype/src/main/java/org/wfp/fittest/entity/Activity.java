package org.wfp.fittest.entity;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class Activity {

	@Id
	@Column(name = "activityid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="activities_activityid_seq", name="activities_activityid_seq")
	@GeneratedValue(generator="activities_activityid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "activitytypeid")
	private ActivityType activityType;
	
	@Column(name = "etcservicemap")
	private String etcServiceMap;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
		name = "activity_country_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")},
		inverseJoinColumns = {@JoinColumn(name = "countryid", referencedColumnName = "countryid")}
	)
	private Set<Country> countries;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")},
		inverseJoinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "missionid")}
	)
	private Set<Mission> missions;
	
	@OneToMany(mappedBy="activity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<ActivityRole> activityRoles;
		
	public Activity() {}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public String getEtcServiceMap() {
		return etcServiceMap;
	}

	public void setEtcServiceMap(String etcServiceMap) {
		this.etcServiceMap = etcServiceMap;
	}

	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public Set<Mission> getMissions() {
		return missions;
	}

	public void setMissions(Set<Mission> missions) {
		this.missions = missions;
	}

	public Set<ActivityRole> getActivityRoles() {
		return activityRoles;
	}

	public void setActivityRoles(Set<ActivityRole> activityRoles) {
		this.activityRoles = activityRoles;
	}
}
