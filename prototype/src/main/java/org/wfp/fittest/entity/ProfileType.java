package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profiletypes")
public class ProfileType {

	@Id
	@Column(name = "profiletype")
	private String profileType;
}
