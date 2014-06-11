package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "missiontypes")
public class MissionType {

	@Id
	@Column(name = "missiontype")
	private String missionType;
	
	@OneToMany(mappedBy = "missionType")
	private List<Mission> missions;
}
