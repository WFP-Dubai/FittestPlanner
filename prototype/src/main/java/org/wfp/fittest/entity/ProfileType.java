package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profiletypes")
public class ProfileType {

	@Id
	@Column(name = "profiletype")
	private String profileType;
	
	@ManyToMany(mappedBy = "profileTypes")
	private List<Staff> staff;
}
