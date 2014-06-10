package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "staffconfirmedtypes")
public class StaffConfirmedType {

	@Id
	@Column(name = "stafftype")
	private String staffType;
}
