package org.wfp.fittest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "audittable")
public class AuditTable {

	@Id
	@Column(name = "auditid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer auditID;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "changedtime")
	private Date changedTime;
	
	@Column(name = "userid")
	private String userID;
	
	@Column(name = "tablename")
	private String tablename;
	
	@ManyToOne
	@JoinColumn(name = "operationtypeid")
	private OperationType operationType;
	
	@Column(name = "oldvalue")
	private String oldValue;
	
	@Column(name = "newvalue")
	private String newValue;
	
	@Column(name = "ipaddress")
	private String IPAddress;
}
