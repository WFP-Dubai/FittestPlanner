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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "confirmedtypes")
@XmlRootElement
public class ConfirmedType {

	@Id
	@Column(name = "confirmedtypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "confirmedtypes_confirmedtypeid_seq", name = "confirmedtypes_confirmedtypeid_seq")
	@GeneratedValue(generator = "confirmedtypes_confirmedtypeid_seq", strategy = GenerationType.SEQUENCE)
	private Integer ID;

	@Column(name = "confirmedtype")
	private String confirmedType;

	@Column(name = "confirmedcolorcode")
	private String confirmedColorCode;
	
	@OneToMany(mappedBy = "confirmedType", fetch = FetchType.EAGER, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<StaffRole> staffRoles = new HashSet<StaffRole>();

	@OneToMany(mappedBy = "confirmedType", fetch = FetchType.EAGER, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Activity> activities = new HashSet<Activity>();

	public ConfirmedType() {
	}

	@XmlTransient
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	@XmlID
	public String getConfirmedType() {
		return confirmedType;
	}

	public void setConfirmedType(String confirmedType) {
		this.confirmedType = confirmedType;
	}

	@XmlElementWrapper(name = "staffRoles")
	@XmlElement(name = "staffRole")
	@XmlIDREF
	public Set<StaffRole> getStaffRoles() {
		return staffRoles;
	}

	public void setStaffRoles(Set<StaffRole> staffRoles) {
		this.staffRoles = staffRoles;
	}

	@XmlElementWrapper(name = "activities")
	@XmlElement(name = "activity")
	@XmlIDREF
	public Set<Activity> getActivities() {
		return activities;
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}

	public String getConfirmedColorCode() {
		return confirmedColorCode;
	}

	public void setConfirmedColorCode(String confirmedColorCode) {
		this.confirmedColorCode = confirmedColorCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConfirmedType other = (ConfirmedType) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

}
