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
	@Column(name = "index")
	private Integer index;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "dateofbirth")
	private Date dateOfBirth;
	
	@Column(name = "title")
	private String title;
	
	@ManyToMany
	@JoinTable(
		name = "staff_profiletype_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "index")},
		inverseJoinColumns = {@JoinColumn(name="profiletype", referencedColumnName = "profiletype")}
	)
	private List<ProfileType> profileTypes;
	
	@Column(name = "thuraya")
	private String thuraya;
	
	@Column(name = "mobile")
	private String mobile;
	
	@ManyToMany
	@JoinTable(
		name = "staff_nationality_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "index")},
		inverseJoinColumns = {@JoinColumn(name = "country", referencedColumnName = "iso")}
	)
	private List<Country> nationalities;
	
	@ManyToMany
	@JoinTable(
		name = "staff_language_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "index")},
		inverseJoinColumns = {@JoinColumn(name = "language", referencedColumnName = "language")}
	)
	private List<Language> languages;
	
	@ManyToOne
	@JoinColumn(name = "stafftype")
	private StaffType staffType;
	
	@Column(name = "staffcolorcode")
	private String staffColorCode;
}
