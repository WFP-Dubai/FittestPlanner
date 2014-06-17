package org.wfp.fittest.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "staff")
public class Staff {

	@Id
	@Column(name = "staffindex")
	private Integer index;
	
	@Column(name = "firstname", nullable = false)
	private String firstName;
	
	@Column(name = "lastname", nullable = false)
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	
	@Column(name = "title")
	private String title;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name = "staff_profiletype_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name="profiletypeid", referencedColumnName = "profiletypeid")}
	)
	private Set<ProfileType> profileTypes = new HashSet<ProfileType>();
	
	@Column(name = "thuraya")
	private String thuraya;
	
	@Column(name = "mobile")
	private String mobile;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name = "staff_nationality_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name = "countryid", referencedColumnName = "countryid")}
	)
	private Set<Country> nationalities = new HashSet<Country>();
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name = "staff_language_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name = "languageid", referencedColumnName = "languageid")}
	)
	private Set<Language> languages = new HashSet<Language>();
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "stafftypeid")
	private StaffType staffType;
	
	@Column(name = "staffcolorcode")
	private String staffColorCode;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name = "staff_staffrole_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name = "staffroleid", referencedColumnName = "staffroleid")}

	)
	private Set<StaffRole> staffRoles = new HashSet<StaffRole>();

	public Staff() {}
	
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<ProfileType> getProfileTypes() {
		return profileTypes;
	}

	public void setProfileTypes(Set<ProfileType> profileTypes) {
		this.profileTypes = profileTypes;
	}

	public String getThuraya() {
		return thuraya;
	}

	public void setThuraya(String thuraya) {
		this.thuraya = thuraya;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<Country> getNationalities() {
		return nationalities;
	}

	public void setNationalities(Set<Country> nationalities) {
		this.nationalities = nationalities;
	}

	public Set<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}

	public StaffType getStaffType() {
		return staffType;
	}

	public void setStaffType(StaffType staffType) {
		this.staffType = staffType;
	}

	public String getStaffColorCode() {
		return staffColorCode;
	}

	public void setStaffColorCode(String staffColorCode) {
		this.staffColorCode = staffColorCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((index == null) ? 0 : index.hashCode());
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
		Staff other = (Staff) obj;
		if (index == null) {
			if (other.index != null)
				return false;
		} else if (!index.equals(other.index))
			return false;
		return true;
	}
	
}
