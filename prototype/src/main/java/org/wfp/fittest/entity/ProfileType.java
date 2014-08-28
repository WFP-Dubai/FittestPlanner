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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "profiletypes")
public class ProfileType implements EntityId {

	@Id
	@Column(name = "profiletypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "profiletypes_profiletypeid_seq", name = "profiletypes_profiletypeid_seq")
	@GeneratedValue(generator = "profiletypes_profiletypeid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "profiletype", nullable = false)
	private String profileType;

	@ManyToMany(mappedBy = "profileTypes", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Staff> staff = new HashSet<Staff>();

	@OneToMany(mappedBy = "profileType", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<ActivityRole> activityRoles = new HashSet<ActivityRole>();

	public ProfileType() {
	}

	public ProfileType(Long iD, String profileType, Set<Staff> staff,
			Set<ActivityRole> activityRoles) {
		super();
		this.id = iD;
		this.profileType = profileType;
		this.staff = staff;
		this.activityRoles = activityRoles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public Set<Staff> getStaff() {
		return staff;
	}

	public List<Long> getStaffIds() {
		return EntityConverter.toIdList(getStaff());
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	public Set<ActivityRole> getActivityRoles() {
		return activityRoles;
	}

	public List<Long> getActivityRoleIds() {
		return EntityConverter.toIdList(getActivityRoles());
	}

	public void setActivityRoles(Set<ActivityRole> activityRoles) {
		this.activityRoles = activityRoles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ProfileType other = (ProfileType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getProfileType();
	}
}
