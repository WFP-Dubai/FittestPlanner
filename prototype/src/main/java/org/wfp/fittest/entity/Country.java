package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
}