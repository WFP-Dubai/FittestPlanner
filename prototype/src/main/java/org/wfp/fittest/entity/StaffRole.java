package org.wfp.fittest.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "staffroles")
@XmlRootElement
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class StaffRole {

	@Id
	@Column(name = "staffroleid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="staffroles_staffroleid_seq", name="staffroles_staffroleid_seq")
	@GeneratedValue(generator="staffroles_staffroleid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
		name = "staffrole_activityrole_mapping",
		joinColumns = {@JoinColumn(name = "staffroleid", referencedColumnName = "staffroleid")},
		inverseJoinColumns = {@JoinColumn(name = "activityroleid", referencedColumnName = "activityroleid")}
	)
	private Set<ActivityRole> activityRoles = new HashSet<ActivityRole>();
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "staffrolestartdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "staffroleenddate")
	private Date endDate;
	
	@Column(name = "staffrolelocation")
	private String location;
	
	@Column(name = "staffrolecomments")
	private String comments;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "staffconfirmedtypeid")
	private ConfirmedType confirmedType;
	
	@ManyToMany(mappedBy="staffRoles", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Staff> staff = new HashSet<Staff>();

	public StaffRole() {}
	
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

	@XmlElementWrapper(name = "activityRoles")
	@XmlElement(name = "activityRole")
	@XmlIDREF
	public Set<ActivityRole> getActivityRoles() {
		return activityRoles;
	}

	public void setActivityRoles(Set<ActivityRole> activityRoles) {
		this.activityRoles = activityRoles;
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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@XmlElement(name = "confirmedType")
	@XmlIDREF
	public ConfirmedType getConfirmedType() {
		return confirmedType;
	}

	public void setConfirmedType(ConfirmedType confirmedType) {
		this.confirmedType = confirmedType;
	}

	@XmlElementWrapper(name = "staffList")
	@XmlElement(name = "staff")
	@XmlIDREF
	public Set<Staff> getStaff() {
		return staff;
	}

	public void setStaff(Set<Staff> staff) {
		this.staff = staff;
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
		StaffRole other = (StaffRole) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return String.format("StaffRole[ID=%d]", getID());
	}
	
}
