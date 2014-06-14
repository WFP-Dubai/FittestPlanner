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

	@OneToMany(mappedBy = "operationType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<AuditTable> audits;
}
