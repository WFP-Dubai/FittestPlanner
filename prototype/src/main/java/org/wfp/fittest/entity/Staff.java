package org.wfp.fittest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	// FK
	@Column(name = "profiletype")
	private ProfileType profileType;
	
	@Column(name = "thuraya")
	private String thuraya;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "nationality")
	private String nationality;
	
	// FK
	@Column(name = "stafftype")
	private StaffType staffType;
	
	@Column(name = "staffcolorcode")
	private String staffColorCode;
}
