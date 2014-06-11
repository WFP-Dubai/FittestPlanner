package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	
	@Id
	@Column(name = "iso")
	private String ISOCode;
	
	@Column(name = "fullname", nullable = false)
	private String fullName;
	
	@Column(name = "region")
	private String region;
	
	@ManyToMany(mappedBy = "nationalities")
	private List<Staff> staffByNationality;
	
	@ManyToMany(mappedBy = "countries")
	private List<Activity> activities;
	
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

	public List<Staff> getStaffByNationality() {
		return staffByNationality;
	}

	public void setStaffByNationality(List<Staff> staffByNationality) {
		this.staffByNationality = staffByNationality;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
}
