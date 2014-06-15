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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "staffroles")
public class StaffRole {

	@Id
	@Column(name = "staffroleid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
		name = "staffrole_activityrole_mapping",
		joinColumns = {@JoinColumn(name = "staffroleid", referencedColumnName = "staffroleid")},
		inverseJoinColumns = {@JoinColumn(name = "activityroleid", referencedColumnName = "activityroleid")}
	)
	private Set<ActivityRole> activityRoles;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "staffconfirmedtypeid")
	private StaffConfirmedType staffConfirmedType;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
		name = "staff_staffrole_mapping",
		joinColumns = {@JoinColumn(name = "staffroleid", referencedColumnName = "staffroleid")},
		inverseJoinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "staffindex")}

	)
	private Set<Staff> staff;
}
