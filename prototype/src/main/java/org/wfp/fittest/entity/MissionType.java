package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "missiontypes")
public class MissionType {

	@Id
	@Column(name = "missiontype")
	private String missionType;
}
