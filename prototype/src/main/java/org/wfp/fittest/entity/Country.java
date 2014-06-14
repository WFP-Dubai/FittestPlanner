package org.wfp.fittest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	
	@Id
	@Column(name = "countryid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "iso", nullable = false)
	private String ISOCode;
	
	@Column(name = "fullname", nullable = false)
	private String fullName;
	
	@Column(name = "region")
	private String region;
	
	@ManyToMany(mappedBy = "nationalities", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Staff> staffByNationality;
	
	@ManyToMany(mappedBy = "countries", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Activity> activities;
	
	public Country() {}

	public String getISOCode() {
		return ISOCode;
	}

	public void setISOCode(String iSOCode) {
		ISOCode = iSOCode;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Staff> getStaffByNationality() {
		return staffByNationality;
	}

	public void setStaffByNationality(Set<Staff> staffByNationality) {
		this.staffByNationality = staffByNationality;
	}

	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}
	
}
