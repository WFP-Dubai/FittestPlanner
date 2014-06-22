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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "missiontypes")
@XmlRootElement
public class MissionType {

	@Id
	@Column(name = "missiontypeid")
	@SequenceGenerator(allocationSize = 1, initialValue = 1, sequenceName = "missiontypes_missiontypeid_seq", name = "missiontypes_missiontypeid_seq")
	@GeneratedValue(generator = "missiontypes_missiontypeid_seq", strategy = GenerationType.SEQUENCE)
	private Integer ID;

	@Column(name = "missiontype")
	private String missionType;

	@OneToMany(mappedBy = "missionType", fetch = FetchType.EAGER, cascade = {
			CascadeType.PERSIST, CascadeType.MERGE })
	private Set<Mission> missions = new HashSet<Mission>();

	public MissionType() {
	}

	@XmlTransient
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	@XmlID
	@XmlElement(name = "ID")
	public String getStringID() {
		return Integer.toString(getID());
	}

	public String getMissionType() {
		return missionType;
	}

	public void setMissionType(String missionType) {
		this.missionType = missionType;
	}

	@XmlElementWrapper(name = "missions")
	@XmlElement(name = "mission")
	@XmlIDREF
	public Set<Mission> getMissions() {
		return missions;
	}

	public void setMissions(Set<Mission> missions) {
		this.missions = missions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
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
		MissionType other = (MissionType) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}

}
