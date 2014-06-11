package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "staffconfirmedtypes")
public class StaffConfirmedType {

	@Id
	@Column(name = "staffconfirmedtype")
	private String staffConfirmedType;
	
	@OneToMany(mappedBy = "staffConfirmedType")
	private List<StaffRole> staffRoles;
}
