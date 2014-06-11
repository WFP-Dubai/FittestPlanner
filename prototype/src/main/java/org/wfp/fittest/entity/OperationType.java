package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "operationtypes")
public class OperationType {

	@Id
	@Column(name = "operationname")
	private String operationName;

	@OneToMany(mappedBy = "operation")
	private List<AuditTable> audits;
}
