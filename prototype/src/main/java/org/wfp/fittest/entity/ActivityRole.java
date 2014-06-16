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
}
