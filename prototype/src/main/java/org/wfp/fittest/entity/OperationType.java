package org.wfp.fittest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "operationtypes")
public class OperationType implements EntityId {

	@Id
	@Column(name = "operationtypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "operationtypes_operationtypeid_seq", name = "operationtypes_operationtypeid_seq")
	@GeneratedValue(generator = "operationtypes_operationtypeid_seq", strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "operationname")
	private String operationName;

	@OneToMany(mappedBy = "operationType", fetch = FetchType.LAZY, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<AuditRecord> auditRecords = new HashSet<AuditRecord>();

	public OperationType() {
	}

	public OperationType(Long iD, String operationName,
			Set<AuditRecord> auditRecords) {
		super();
		this.id = iD;
		this.operationName = operationName;
		this.auditRecords = auditRecords;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
	}

	public String getStringId() {
		return Long.toString(getId());
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public Set<AuditRecord> getAuditRecords() {
		return auditRecords;
	}

	public void setAuditRecords(Set<AuditRecord> auditRecords) {
		this.auditRecords = auditRecords;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperationType other = (OperationType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
