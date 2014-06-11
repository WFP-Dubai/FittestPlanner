package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staffroles")
public class StaffRole {

	@Id
	@Column(name = "id")
	private Integer ID;
	
	private ActivityRole activityRole;
}
