package org.wfp.fittest.entity;

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
@Table(name = "activities")
public class Activity {

	@Id
	@Column(name = "activityid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "activitytypeid")
	private ActivityType activityType;
	
	@Column(name = "etcservicemap")
	private String etcServiceMap;
	
	@ManyToMany
	@JoinTable(
		name = "activity_country_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")},
		inverseJoinColumns = {@JoinColumn(name = "countryid", referencedColumnName = "countryid")}
	)
	private List<Country> countries;
	
	@ManyToMany
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")},
		inverseJoinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "missionid")}
	)
	private List<Mission> missions;
}
