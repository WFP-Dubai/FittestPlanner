package org.wfp.fittest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "staff")
public class Staff implements EntityId {

	@Id
	@Column(name = "staffindex")
	private Long id;

	@Column(name = "firstname", nullable = false)
	private String firstName;

	@Column(name = "lastname", nullable = false)
	private String lastName;

	@Temporal(TemporalType.DATE)
	@Column(name = "dateofbirth")
	private Date dateOfBirth;

	@Column(name = "title")
	private String title;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinTable(name = "staff_profiletype_mapping", joinColumns = { @JoinColumn(name = "staffindex", referencedColumnName = "staffindex") }, inverseJoinColumns = { @JoinColumn(name = "profiletypeid", referencedColumnName = "profiletypeid") })
	private Set<ProfileType> profileTypes = new HashSet<ProfileType>();

	@Column(name = "thuraya")
	private String thuraya;

	@Column(name = "mobile")
	private String mobile;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinTable(name = "staff_nationality_mapping", joinColumns = { @JoinColumn(name = "staffindex", referencedColumnName = "staffindex") }, inverseJoinColumns = { @JoinColumn(name = "countryid", referencedColumnName = "countryid") })
	private Set<Country> nationalities = new HashSet<Country>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinTable(name = "staff_language_mapping", joinColumns = { @JoinColumn(name = "staffindex", referencedColumnName = "staffindex") }, inverseJoinColumns = { @JoinColumn(name = "languageid", referencedColumnName = "languageid") })
	private Set<Language> languages = new HashSet<Language>();

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "stafftypeid")
	private StaffType staffType;

	@Column(name = "staffcolorcode")
	private String staffColorCode;

	@OneToMany(mappedBy = "staff", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<StaffRole> staffRoles = new HashSet<StaffRole>();

	public Staff() {
	}

	public Staff(Long ID, String firstName, String lastName, Date dateOfBirth,
			String title, Set<ProfileType> profileTypes, String thuraya,
			String mobile, Set<Country> nationalities, Set<Language> languages,
			StaffType staffType, String staffColorCode,
			Set<StaffRole> staffRoles) {
		super();
		this.id = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.title = title;
		this.profileTypes = profileTypes;
		this.thuraya = thuraya;
		this.mobile = mobile;
		this.nationalities = nationalities;
		this.languages = languages;
		this.staffType = staffType;
		this.staffColorCode = staffColorCode;
		this.staffRoles = staffRoles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long ID) {
		this.id = ID;
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

	public String getName() {
		return this.firstName + " " + this.lastName;
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

	public String getStaffColorCode() {
		return staffColorCode;
	}

	public void setStaffColorCode(String staffColorCode) {
		this.staffColorCode = staffColorCode;
	}

	public StaffType getStaffType() {
		return staffType;
	}
	
	public Long getStaffTypeId() {
		return staffType.getId();
	}
	
	public String getStaffTypeDescription() {
		return getStaffType().getStaffType();
	}

	public void setStaffType(StaffType staffType) {
		this.staffType = staffType;
	}

	public Set<ProfileType> getProfileTypes() {
		return profileTypes;
	}
	
	public List<Long> getProfileTypeIds() {
		return EntityConverter.toIdList(getProfileTypes());
	}
	
	public List<String> getProfileTypeDescriptions() {
		List<String> descs = new ArrayList<String>();
		for (ProfileType pt : getProfileTypes())
			descs.add(pt.getProfileType());
		return descs;
	}

	public void setProfileTypes(Set<ProfileType> profileTypes) {
		this.profileTypes = profileTypes;
	}

	public Set<Country> getNationalities() {
		return nationalities;
	}
	
	public List<Long> getNationalityIds() {
		return EntityConverter.toIdList(getNationalities());
	}

	public void setNationalities(Set<Country> nationalities) {
		this.nationalities = nationalities;
	}

	public Set<Language> getLanguages() {
		return languages;
	}
	
	public List<Long> getLanguageIds() {
		return EntityConverter.toIdList(getLanguages());
	}

	public void setLanguages(Set<Language> languages) {
		this.languages = languages;
	}

	public Set<StaffRole> getStaffRoles() {
		return staffRoles;
	}
	
	public List<Long> getStaffRoleIds() {
		return EntityConverter.toIdList(getStaffRoles());
	}

	public void setStaffRoles(Set<StaffRole> staffRoles) {
		this.staffRoles = staffRoles;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Staff other = (Staff) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
