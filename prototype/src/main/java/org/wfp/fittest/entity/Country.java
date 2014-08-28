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
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "countries")
public class Country implements EntityId {

	@Id
	@Column(name = "countryid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "countries_countryid_seq", name = "countries_countryid_seq")
	@GeneratedValue(generator = "countries_countryid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "iso", nullable = false)
	private String isoCode;

	@Column(name = "fullname", nullable = false)
	private String fullName;

	@Column(name = "region")
	private String region;

	@ManyToMany(mappedBy = "nationalities", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Staff> staffByNationality = new HashSet<Staff>();

	@ManyToMany(mappedBy = "countries", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Activity> activities = new HashSet<Activity>();

	public Country() {
	}

	public Country(Long iD, String isoCode, String fullName, String region,
			Set<Staff> staffByNationality, Set<Activity> activities) {
		super();
		this.id = iD;
		this.isoCode = isoCode;
		this.fullName = fullName;
		this.region = region;
		this.staffByNationality = staffByNationality;
		this.activities = activities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long Id) {
		this.id = Id;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
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

	public List<Long> getStaffByNationalityIds() {
		return EntityConverter.toIdList(getStaffByNationality());
	}

	public void setStaffByNationality(Set<Staff> staffByNationality) {
		this.staffByNationality = staffByNationality;
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
