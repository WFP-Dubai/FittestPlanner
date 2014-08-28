package org.wfp.fittest.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "staffroles")
public class StaffRole implements EntityId {

	@Id
	@Column(name = "staffroleid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "staffroles_staffroleid_seq", name = "staffroles_staffroleid_seq")
	@GeneratedValue(generator = "staffroles_staffroleid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "staffroleactivityroleid")
	private ActivityRole activityRole;

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

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "staffconfirmedtypeid")
	private ConfirmedType confirmedType;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "staffrolestaffindex")
	private Staff staff;

	public StaffRole() {
	}

	public StaffRole(Long iD, ActivityRole activityRole, Date startDate,
			Date endDate, String location, String comments,
			ConfirmedType confirmedType, Staff staff) {
		super();
		this.id = iD;
		this.activityRole = activityRole;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.comments = comments;
		this.confirmedType = confirmedType;
		this.staff = staff;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
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

	public ConfirmedType getConfirmedType() {
		return confirmedType;
	}

	public Long getConfirmedTypeId() {
		return getConfirmedType().getId();
	}

	public String getConfirmedTypeDescription() {
		return getConfirmedType().getConfirmedType();
	}

	public String getConfirmedTypeColorCode() {
		return getConfirmedType().getConfirmedColorCode();
	}

	public void setConfirmedType(ConfirmedType confirmedType) {
		this.confirmedType = confirmedType;
	}

	public ActivityRole getActivityRole() {
		return activityRole;
	}

	public Long getActivityRoleId() {
		return getActivityRole().getId();
	}

	public void setActivityRole(ActivityRole activityRole) {
		this.activityRole = activityRole;
	}

	public String getActivityRoleDescription() {
		return getActivityRole().getActivityDescription();
	}

	public Long getActivityRoleProfileTypeId() {
		return getActivityRole().getProfileType().getId();
	}
	
	public String getActivityRoleProfileTypeDescription() {
		return getActivityRole().getProfileTypeDescription();
	}

	public Staff getStaff() {
		return staff;
	}

	public Long getStaffId() {
		return getStaff().getId();
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getStaffFirstName() {
		return getStaff().getFirstName();
	}

	public String getStaffLastName() {
		return getStaff().getLastName();
	}

	public String getStaffName() {
		return getStaff().getName();
	}

	public String getStaffColorCode() {
		return getStaff().getStaffColorCode();
	}

	public String getActivityTypeColorCode() {
		return getActivityRole().getActivity().getActivityType().getColorCode();
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
		StaffRole other = (StaffRole) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("StaffRole[ID=%d]", getId());
	}

}
