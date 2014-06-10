package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operationtypes")
public class OperationType {

	@Id
	@Column(name = "operationname")
	private String operationName;
}
