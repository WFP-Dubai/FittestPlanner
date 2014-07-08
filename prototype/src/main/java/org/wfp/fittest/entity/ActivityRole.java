package org.wfp.fittest.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "activityroles")
@XmlRootElement
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ActivityRole {

	@Id
	@Column(name = "activityroleid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "activityroles_activityroleid_seq", name = "activityroles_activityroleid_seq")
	@GeneratedValue(generator = "activityroles_activityroleid_seq", strategy = GenerationType.SEQUENCE)
	private Integer ID;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "activityid")
	private Activity activity;

	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "profiletypeid")
	private ProfileType profileType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "activityrolestartdate")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "activityroleenddate")
	private Date endDate;

	@Column(name = "activityrolelocation")
	private String location;

	@ManyToMany(mappedBy = "activityRoles", fetch = FetchType.EAGER, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<StaffRole> staffRoles;

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

	@XmlIDREF
	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	@XmlIDREF
	public ProfileType getProfileType() {
		return profileType;
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
		ActivityRole other = (ActivityRole) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s | %s | %s", getActivity().getDescription(),
				getProfileType().getProfileType(), getLocation());
	}
}
