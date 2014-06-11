package org.wfp.fittest.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "staffroles")
public class StaffRole {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@JoinTable(
		name = "staffrole_activityrole_mapping",
		joinColumns = {@JoinColumn(name = "staffroleid", referencedColumnName = "id")},
		inverseJoinColumns = {@JoinColumn(name = "activityroleid", referencedColumnName = "id")}
	)
	private List<ActivityRole> activityRoles;
	
	@Column(name = "startdate")
	private Timestamp startdate;
	
	@Column(name = "enddate")
	private Timestamp enddate;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "comments")
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "staffconfirmedtype")
	private StaffConfirmedType staffConfirmedType;
	
	@JoinTable(
		name = "staff_staffrole_mapping",
		joinColumns = {@JoinColumn(name = "staffindex", referencedColumnName = "id")},
		inverseJoinColumns = {@JoinColumn(name = "staffroleid", referencedColumnName = "id")}
	)
	private List<Staff> staff;
}
