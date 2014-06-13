package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "operationtypes")
public class OperationType {

	@Id
	@Column(name = "operationtypeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "operationname")
	private String operationName;

	@OneToMany(mappedBy = "operationType")
	private List<AuditTable> audits;
}
