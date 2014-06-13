package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profiletypes")
public class ProfileType {

	@Id
	@Column(name = "profiletypeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "profiletype", nullable = false)
	private String profileType;
	
	@ManyToMany(mappedBy = "profileTypes")
	private List<Staff> staff;
	
	@OneToMany(mappedBy = "profileType")
	private List<ActivityRole> activityRoles;
}
