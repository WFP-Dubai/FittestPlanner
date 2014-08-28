package org.wfp.fittest.entity;

import java.util.HashSet;
import java.util.List;
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

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "confirmedtypes")
public class ConfirmedType implements EntityId {

	@Id
	@Column(name = "confirmedtypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "confirmedtypes_confirmedtypeid_seq", name = "confirmedtypes_confirmedtypeid_seq")
	@GeneratedValue(generator = "confirmedtypes_confirmedtypeid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "confirmedtype")
	private String confirmedType;

	@Column(name = "confirmedcolorcode")
	private String confirmedColorCode;

	@OneToMany(mappedBy = "confirmedType", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<StaffRole> staffRoles = new HashSet<StaffRole>();

	@OneToMany(mappedBy = "confirmedType", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Activity> activities = new HashSet<Activity>();

	public ConfirmedType() {
	}

	public ConfirmedType(Long iD, String confirmedType,
			String confirmedColorCode, Set<StaffRole> staffRoles,
			Set<Activity> activities) {
		super();
		this.id = iD;
		this.confirmedType = confirmedType;
		this.confirmedColorCode = confirmedColorCode;
		this.staffRoles = staffRoles;
		this.activities = activities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
	}

	public String getConfirmedType() {
		return confirmedType;
	}

	public void setConfirmedType(String confirmedType) {
		this.confirmedType = confirmedType;
	}

	public Set<StaffRole> getStaffRoles() {
		return staffRoles;
	}
	
	public List<Long> getStaffRoleIds() {
		return EntityConverter.toIdList(getStaffRoles());
	}

	public void setStaffRoles(Set<StaffRole> staffRoles) {
		this.staffRoles = staffRoles;
	}

	public Set<Activity> getActivities() {
		return activities;
	}
	
	public List<Long> getActivityRoleIds() {
		return EntityConverter.toIdList(getActivities());
	}

	public void setActivities(Set<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
