package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stafftypes")
public class StaffType {

	@Id
	@Column(name = "stafftype")
	private String staffType;
}
