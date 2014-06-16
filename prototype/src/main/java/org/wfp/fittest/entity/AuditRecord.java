package org.wfp.fittest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "audittable")
public class AuditRecord {

	@Id
	@Column(name = "auditid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="audittable_auditid_seq", name="audittable_auditid_seq")
	@GeneratedValue(generator="audittable_auditid_seq", strategy=GenerationType.SEQUENCE)
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
