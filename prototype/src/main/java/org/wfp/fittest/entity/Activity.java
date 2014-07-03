package org.wfp.fittest.entity;

import java.util.HashSet;
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
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "activities")
@XmlRootElement(name = "activity")
public class Activity {

	@Id
	@Column(name = "activityid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="activities_activityid_seq", name="activities_activityid_seq")
	@GeneratedValue(generator="activities_activityid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "activitydescription")
	private String description;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "activitytypeid")
	private ActivityType activityType;
	
	@Column(name = "activityetcservicemap")
	private String etcServiceMap;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@OrderBy
	@JoinTable(
		name = "activity_country_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")},
		inverseJoinColumns = {@JoinColumn(name = "countryid", referencedColumnName = "countryid")}
	)
	private Set<Country> countries = new HashSet<Country>();
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@OrderBy
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")},
		inverseJoinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "missionid")}
	)
	private Set<Mission> missions = new HashSet<Mission>();
	
	@OneToMany(mappedBy="activity", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@OrderBy
	private Set<ActivityRole> activityRoles = new HashSet<ActivityRole>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "activityconfirmedtypeid")
	private ConfirmedType confirmedType;
	
	public Activity() {}

	@XmlTransient
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	@XmlID
	@XmlElement(name = "ID")
	public String getStringID() {
		return Integer.toString(getID());
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlIDREF
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

	@XmlIDREF
	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	@XmlElementWrapper(name = "missions")
	@XmlElement(name = "mission")
	@XmlIDREF
	public Set<Mission> getMissions() {
		return missions;
	}

	public void setMissions(Set<Mission> missions) {
		this.missions = missions;
	}

	@XmlElementWrapper(name = "activityRoles")
	@XmlElement(name = "activityRole")
	@XmlIDREF
	public Set<ActivityRole> getActivityRoles() {
		return activityRoles;
	}

	public void setActivityRoles(Set<ActivityRole> activityRoles) {
		this.activityRoles = activityRoles;
	}

	@XmlElement(name = "confirmedType")
	@XmlIDREF
	public ConfirmedType getConfirmedType() {
		return confirmedType;
	}

	public void setConfirmedType(ConfirmedType confirmedType) {
		this.confirmedType = confirmedType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
}
