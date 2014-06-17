package org.wfp.fittest.entity;

import java.util.Date;
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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "missions")
public class Mission {

	@Id
	@Column(name = "missionid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="missions_missionid_seq", name="missions_missionid_seq")
	@GeneratedValue(generator="missions_missionid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "missionname", nullable = false)
	private String missionName;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "missiontypeid")
	private MissionType missionType;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name = "mission_activity_mapping",
		joinColumns = {@JoinColumn(name = "missionid", referencedColumnName = "missionid")},
		inverseJoinColumns = {@JoinColumn(name = "activityid", referencedColumnName = "activityid")}
	)
	private Set<Activity> activities = new HashSet<Activity>();

	@Column(name = "missionlocation", nullable = false)
	private String missionLocation;
	
	@Column(name = "missiondescription")
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "missionstartdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "missionenddate")
	private Date endDate;

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

	public String getMissionLocation() {
		return missionLocation;
	}

	public void setLocation(String missionLocation) {
		this.missionLocation = missionLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
		Mission other = (Mission) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
}
