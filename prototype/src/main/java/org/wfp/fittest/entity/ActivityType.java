package org.wfp.fittest.entity;

import java.util.HashSet;
import java.util.List;
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

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "activitytypes")
public class ActivityType implements EntityId {

	@Id
	@Column(name = "activitytypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "activitytypes_activitytypeid_seq", name = "activitytypes_activitytypeid_seq")
	@GeneratedValue(generator = "activitytypes_activitytypeid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "activitytype")
	private String activityType;

	@Column(name = "activitytypecolorcode")
	private String colorCode;

	@OneToMany(mappedBy = "activityType", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Activity> activities = new HashSet<Activity>();

	public ActivityType() {
	}

	public ActivityType(Long iD, String activityType, String colorCode,
			Set<Activity> activities) {
		super();
		this.id = iD;
		this.activityType = activityType;
		this.colorCode = colorCode;
		this.activities = activities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
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

	public Set<Activity> getActivities() {
		return activities;
	}

	public List<Long> getActivityIds() {
		return EntityConverter.toIdList(getActivities());
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

}
