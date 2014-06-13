package org.wfp.fittest.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	
	@Column(name = "title")
	private String title;
	
	@ManyToMany
	@JoinTable(
		name = "staff_profiletype_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name="profiletypeid", referencedColumnName = "profiletypeid")}
	)
	private List<ProfileType> profileTypes;
	
	@Column(name = "thuraya")
	private String thuraya;
	
	@Column(name = "mobile")
	private String mobile;
	
	@ManyToMany
	@JoinTable(
		name = "staff_nationality_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name = "countryid", referencedColumnName = "countryid")}
	)
	private List<Country> nationalities;
	
	@ManyToMany
	@JoinTable(
		name = "staff_language_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")},
		inverseJoinColumns = {@JoinColumn(name = "languageid", referencedColumnName = "languageid")}
	)
	private List<Language> languages;
	
	@ManyToOne
	@JoinColumn(name = "stafftypeid")
	private StaffType staffType;
	
	@Column(name = "staffcolorcode")
	private String staffColorCode;
}
