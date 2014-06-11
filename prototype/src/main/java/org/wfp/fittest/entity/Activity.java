package org.wfp.fittest.entity;

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
@Table(name = "activities")
public class Activity {

	@Id
	@Column(name = "id")
	private Integer ID;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "activitytype")
	private ActivityType activityType;
	
	@Column(name = "etcservicemap")
	private String etcServiceMap;
	
	@ManyToMany
	@JoinTable(
		name = "activity_country_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "id")},
		inverseJoinColumns = {@JoinColumn(name = "country", referencedColumnName = "iso")}
	)
	private List<Country> countries;
	
	@ManyToMany
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "id")},
		inverseJoinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "id")}
	)
	private List<Mission> missions;
}
