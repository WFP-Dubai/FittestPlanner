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
@Table(name = "audittable")
public class AuditRecord implements EntityId {

	@Id
	@Column(name = "auditid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="audittable_auditid_seq", name="audittable_auditid_seq")
	@GeneratedValue(generator="audittable_auditid_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "changedtime")
	private Date changedTime;
	
	@Column(name = "userid")
	private String userID;
	
	@Column(name = "tablename")
	private String tablename;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "operationtypeid")
	private OperationType operationType;
	
	@Column(name = "oldvalue")
	private String oldValue;
	
	@Column(name = "newvalue")
	private String newValue;
	
	@Column(name = "ipaddress")
	private String IPAddress;
	
	public AuditRecord() {}
	
	public AuditRecord(Long auditID, Date changedTime, String userID,
			String tablename, OperationType operationType, String oldValue,
			String newValue, String iPAddress) {
		super();
		this.id = auditID;
		this.changedTime = changedTime;
		this.userID = userID;
		this.tablename = tablename;
		this.operationType = operationType;
		this.oldValue = oldValue;
		this.newValue = newValue;
		IPAddress = iPAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStringID() {
		return Long.toString(getId());
	}

	public Date getChangedTime() {
		return changedTime;
	}

	public void setChangedTime(Date changedTime) {
		this.changedTime = changedTime;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public void setOperationType(OperationType operationType) {
		this.operationType = operationType;
	}

	public String getOldValue() {
		return oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

	public String getNewValue() {
		return newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getIPAddress() {
		return IPAddress;
	}

	public void setIPAddress(String iPAddress) {
		IPAddress = iPAddress;
	}
}
