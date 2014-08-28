package org.wfp.fittest.entity;

import java.util.ArrayList;
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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "activities")
public class Activity implements EntityId {

	@Id
	@Column(name = "activityid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "activities_activityid_seq", name = "activities_activityid_seq")
	@GeneratedValue(generator = "activities_activityid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "activitydescription")
	private String description;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "activitytypeid")
	private ActivityType activityType;

	@Column(name = "activityetcservicemap")
	private String etcServiceMap;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@OrderBy
	@JoinTable(name = "activity_country_mapping", joinColumns = { @JoinColumn(name = "activityid", referencedColumnName = "activityid") }, inverseJoinColumns = { @JoinColumn(name = "countryid", referencedColumnName = "countryid") })
	private Set<Country> countries = new HashSet<Country>();

	@OneToMany(mappedBy = "activity", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	@OrderBy
	private Set<ActivityRole> activityRoles = new HashSet<ActivityRole>();

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "activityconfirmedtypeid")
	private ConfirmedType confirmedType;

	public Activity() {
	}

	public Activity(Long Id, String description, ActivityType activityType,
			String etcServiceMap, Set<Country> countries,
			Set<ActivityRole> activityRoles, ConfirmedType confirmedType) {
		super();
		this.id = Id;
		this.description = description;
		this.activityType = activityType;
		this.etcServiceMap = etcServiceMap;
		this.countries = countries;
		this.activityRoles = activityRoles;
		this.confirmedType = confirmedType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEtcServiceMap() {
		return etcServiceMap;
	}

	public void setEtcServiceMap(String etcServiceMap) {
		this.etcServiceMap = etcServiceMap;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public Long getActivityTypeId() {
		return activityType.getId();
	}
	
	public String getActivityTypeDescription() {
		return getActivityType().getActivityType();
	}

	public ConfirmedType getConfirmedType() {
		return confirmedType;
	}

	public void setConfirmedType(ConfirmedType confirmedType) {
		this.confirmedType = confirmedType;
	}
	
	public Long getConfirmedTypeId() {
		return confirmedType.getId();
	}
	
	public String getConfirmedTypeDescription() {
		return getConfirmedType().getConfirmedType();
	}
	
	public String getConfirmedTypeColorCode() {
		return getConfirmedType().getConfirmedColorCode();
	}
	
	public Set<Country> getCountries() {
		return countries;
	}

	public void setCountries(Set<Country> countries) {
		this.countries = countries;
	}

	public List<Long> getCountryIds() {
		return EntityConverter.toIdList(getCountries());
	}
	
	public List<String> getCountryNames() {
		List<String> names = new ArrayList<String>();
		for (Country c : getCountries())
			names.add(c.getFullName());
		return names;
	}

	public Set<ActivityRole> getActivityRoles() {
		return activityRoles;
	}

	public void setActivityRoles(Set<ActivityRole> activityRoles) {
		this.activityRoles = activityRoles;
	}
	
	public List<Long> getActivityRoleIds() {
		return EntityConverter.toIdList(getActivityRoles());
	}
	
	public List<String> getActivityRoleProfileTypeDescriptions() {
		List<String> descs = new ArrayList<String>();
		for (ActivityRole ar : getActivityRoles()) {
			descs.add(ar.getProfileTypeDescription());
		}
		return descs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getDescription();
	}

}
