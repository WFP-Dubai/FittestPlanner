package org.wfp.fittest.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {

	@Id
	@Column(name = "languageid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="languages_languageid_seq", name="languages_languageid_seq")
	@GeneratedValue(generator="languages_languageid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "language")
	private String language;
	
	@ManyToMany(mappedBy = "languages")
	private Set<Staff> staffByLanguage = new HashSet<Staff>();

	public Language() {}
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Set<Staff> getStaffByLanguage() {
		return staffByLanguage;
	}

	public void setStaffByLanguage(Set<Staff> staffByLanguage) {
		this.staffByLanguage = staffByLanguage;
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
		Language other = (Language) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
}
