package org.wfp.fittest.entity;

import java.util.HashSet;
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
	
	@OneToMany(mappedBy = "staffConfirmedType", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<StaffRole> staffRoles = new HashSet<StaffRole>();

	public StaffConfirmedType() {}
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getStaffConfirmedType() {
		return staffConfirmedType;
	}

	public void setStaffConfirmedType(String staffConfirmedType) {
		this.staffConfirmedType = staffConfirmedType;
	}

	public Set<StaffRole> getStaffRoles() {
		return staffRoles;
	}

	public void setStaffRoles(Set<StaffRole> staffRoles) {
		this.staffRoles = staffRoles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffConfirmedType other = (StaffConfirmedType) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
}
