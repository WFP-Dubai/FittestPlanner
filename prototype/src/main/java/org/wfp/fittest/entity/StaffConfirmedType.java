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
@Table(name = "staffconfirmedtypes")
public class StaffConfirmedType {

	@Id
	@Column(name = "staffconfirmedtypeid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="staffconfirmedtypes_staffconfirmedtypeid_seq", name="staffconfirmedtypes_staffconfirmedtypeid_seq")
	@GeneratedValue(generator="staffconfirmedtypes_staffconfirmedtypeid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "staffconfirmedtype")
	private String staffConfirmedType;
	
	@OneToMany(mappedBy = "staffConfirmedType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<StaffRole> staffRoles;
}
