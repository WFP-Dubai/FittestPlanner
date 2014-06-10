package org.wfp.fittest.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "audittable")
public class AuditTable {

	@Id
	@Column(name = "auditid")
	private Integer auditID;
	
	@Column(name = "changedtime")
	private Timestamp changedTime;
	
	@Column(name = "userid")
	private String userID;
	
	@Column(name = "tablename")
	private String tablename;
	
	// FK
	@Column(name = "operation")
	private OperationType operation;
	
	@Column(name = "oldvalue")
	private String oldValue;
	
	@Column(name = "newvalue")
	private String newValue;
	
	@Column(name = "ipaddress")
	private String IPAddress;
}
