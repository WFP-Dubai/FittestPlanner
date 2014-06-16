package org.wfp.fittest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "stafftypes")
public class StaffType {

	@Id
	@Column(name = "stafftypeid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="stafftypes_stafftypeid_seq", name="stafftypes_stafftypeid_seq")
	@GeneratedValue(generator="stafftypes_stafftypeid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "stafftype")
	private String staffType;
	
	@OneToMany(mappedBy = "staffType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Staff> staff;
}
