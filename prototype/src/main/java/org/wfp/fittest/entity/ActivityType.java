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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "activitytypes")
@XmlRootElement
public class ActivityType {

	@Id
	@Column(name = "activitytypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "activitytypes_activitytypeid_seq", name = "activitytypes_activitytypeid_seq")
	@GeneratedValue(generator = "activitytypes_activitytypeid_seq", strategy = GenerationType.SEQUENCE)
	private Integer ID;

	@Column(name = "activitytype")
	private String activityType;

	@Column(name = "activitytypecolorcode")
	private String colorCode;

	@OneToMany(mappedBy = "activityType", fetch = FetchType.EAGER, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Activity> activities = new HashSet<Activity>();
	
	

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
	
	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	@XmlElementWrapper(name = "activities")
	@XmlElement(name = "activity")
	@XmlIDREF
	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

}
