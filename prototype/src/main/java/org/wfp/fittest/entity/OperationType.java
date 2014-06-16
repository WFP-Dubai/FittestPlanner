package org.wfp.fittest.entity;

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
public class OperationType {

	@Id
	@Column(name = "operationtypeid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="operationtypes_operationtypeid_seq", name="operationtypes_operationtypeid_seq")
	@GeneratedValue(generator="operationtypes_operationtypeid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "operationname")
	private String operationName;

	@OneToMany(mappedBy = "operationType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<AuditRecord> auditRecords;
}
