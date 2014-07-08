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
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "countries")
@XmlRootElement
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Country {
	
	@Id
	@Column(name = "countryid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="countries_countryid_seq", name="countries_countryid_seq")
	@GeneratedValue(generator="countries_countryid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "iso", nullable = false)
	private String ISOCode;
	
	@Column(name = "fullname", nullable = false)
	private String fullName;
	
	@Column(name = "region")
	private String region;
	
	@ManyToMany(mappedBy = "nationalities", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Staff> staffByNationality = new HashSet<Staff>();
	
	@ManyToMany(mappedBy = "countries", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Activity> activities = new HashSet<Activity>();
	
	public Country() {}

	public Integer getID() {
		return ID;
	}
	
	@XmlID
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

	@XmlElementWrapper(name = "staffNationality")
	@XmlElement(name = "staff")
	@XmlIDREF
	public Set<Staff> getStaffByNationality() {
		return staffByNationality;
	}

	public void setStaffByNationality(Set<Staff> staffByNationality) {
		this.staffByNationality = staffByNationality;
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
