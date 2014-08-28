package org.wfp.fittest.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "activityroles")
public class ActivityRole implements EntityId {

	@Id
	@Column(name = "activityroleid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "activityroles_activityroleid_seq", name = "activityroles_activityroleid_seq")
	@GeneratedValue(generator = "activityroles_activityroleid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
			CascadeType.MERGE })
	@JoinColumn(name = "activityid")
	private Activity activity;

	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
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

	@OneToMany(mappedBy = "activityRole", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<StaffRole> staffRoles;

	public ActivityRole() {
	}

	public ActivityRole(Long id, Activity activity, ProfileType profileType,
			Date startDate, Date endDate, String location,
			Set<StaffRole> staffRoles) {
		super();
		this.id = id;
		this.activity = activity;
		this.profileType = profileType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.staffRoles = staffRoles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Activity getActivity() {
		return activity;
	}

	public Long getActivityId() {
		return activity.getId();
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public ProfileType getProfileType() {
		return profileType;
	}

	public Long getProfileTypeId() {
		return profileType.getId();
	}

	public void setProfileType(ProfileType profileType) {
		this.profileType = profileType;
	}
	
	public String getProfileTypeDescription() {
		return getProfileType().getProfileType();
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

	public Set<StaffRole> getStaffRoles() {
		return staffRoles;
	}

	public List<Long> getStaffRoleIds() {
		return EntityConverter.toIdList(getStaffRoles());
	}

	public void setStaffRoles(Set<StaffRole> staffRoles) {
		this.staffRoles = staffRoles;
	}
	
	public String getActivityDescription() {
		return getActivity().getDescription();
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
		ActivityRole other = (ActivityRole) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s | %s | %s", getActivity().getDescription(),
				getProfileType().getProfileType(), getLocation());
	}
}
