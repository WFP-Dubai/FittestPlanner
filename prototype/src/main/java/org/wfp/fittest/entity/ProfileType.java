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
import javax.persistence.ManyToMany;
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
@Table(name = "profiletypes")
@XmlRootElement
public class ProfileType {

	@Id
	@Column(name = "profiletypeid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="profiletypes_profiletypeid_seq", name="profiletypes_profiletypeid_seq")
	@GeneratedValue(generator="profiletypes_profiletypeid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "profiletype", nullable = false)
	private String profileType;
	
	@ManyToMany(mappedBy = "profileTypes", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Staff> staff = new HashSet<Staff>();
	
	@OneToMany(mappedBy = "profileType", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<ActivityRole> activityRoles = new HashSet<ActivityRole>();

	public ProfileType() {}
	
	@XmlTransient
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	@XmlID
	@XmlElement(name = "ID")
	public String getStringID() {
		return Integer.toString(getID());
	}
	
	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	@XmlIDREF
	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
	}

	@XmlElementWrapper(name = "activityRoles")
	@XmlElement(name = "activityRole")
	@XmlIDREF
	public Set<ActivityRole> getActivityRoles() {
		return activityRoles;
	}

	public void setActivityRoles(Set<ActivityRole> activityRoles) {
		this.activityRoles = activityRoles;
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
		ProfileType other = (ProfileType) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return getProfileType();
	}
}
