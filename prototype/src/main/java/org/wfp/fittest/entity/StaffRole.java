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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "staffroles")
public class StaffRole {

	@Id
	@Column(name = "staffroleid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="staffroles_staffroleid_seq", name="staffroles_staffroleid_seq")
	@GeneratedValue(generator="staffroles_staffroleid_seq", strategy=GenerationType.SEQUENCE)
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
	
	@ManyToMany(mappedBy="staffRoles")
	private Set<Staff> staff;
}
