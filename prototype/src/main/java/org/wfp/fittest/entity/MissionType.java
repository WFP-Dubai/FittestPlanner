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
@Table(name = "missiontypes")
public class MissionType {

	@Id
	@Column(name = "missiontypeid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="missiontypes_missiontypeid_seq", name="missiontypes_missiontypeid_seq")
	@GeneratedValue(generator="missiontypes_missiontypeid_seq", strategy=GenerationType.SEQUENCE)
	private String missionType;
	
	@OneToMany(mappedBy = "missionType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Mission> missions;
}
