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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "audittable")
@XmlRootElement
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
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
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinColumn(name = "operationtypeid")
	private OperationType operationType;
	
	@Column(name = "oldvalue")
	private String oldValue;
	
	@Column(name = "newvalue")
	private String newValue;
	
	@Column(name = "ipaddress")
	private String IPAddress;

	@XmlTransient
	public Integer getAuditID() {
		return auditID;
	}

	public void setAuditID(Integer auditID) {
		this.auditID = auditID;
	}
	
	@XmlID
	@XmlElement(name = "auditID")
	public String getStringID() {
		return Integer.toString(getAuditID());
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

	@XmlIDREF
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
