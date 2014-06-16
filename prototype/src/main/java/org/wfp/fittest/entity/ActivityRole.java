package org.wfp.fittest.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity
@Table(name = "activityroles")
public class ActivityRole {

	@Id
	@Column(name = "activityroleid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="activityroles_activityroleid_seq", name="activityroles_activityroleid_seq")
	@GeneratedValue(generator="activityroles_activityroleid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@ManyToOne
	@JoinColumn(name = "activityid")
	private Activity activity;
	
	@ManyToOne
	@JoinColumn(name = "profiletypeid")
	private ProfileType profileType;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "location")
	private String location;
	
	@ManyToMany(mappedBy="activityRoles")
	private Set<StaffRole> staffRoles;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

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

	public Set<StaffRole> getStaffRoles() {
		return staffRoles;
	}

	public void setStaffRoles(Set<StaffRole> staffRoles) {
		this.staffRoles = staffRoles;
	}
	
}
