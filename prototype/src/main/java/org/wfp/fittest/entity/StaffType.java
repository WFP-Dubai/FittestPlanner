package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stafftypes")
public class StaffType {

	@Id
	@Column(name = "stafftypeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "stafftype")
	private String staffType;
	
	@OneToMany(mappedBy = "staffType")
	private List<Staff> staff;
}
