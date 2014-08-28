package org.wfp.fittest.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import org.wfp.fittest.converter.EntityConverter;

@Entity
@Table(name = "languages")
public class Language implements EntityId {

	@Id
	@Column(name = "languageid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="languages_languageid_seq", name="languages_languageid_seq")
	@GeneratedValue(generator="languages_languageid_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "language")
	private String language;
	
	@ManyToMany(mappedBy = "languages", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Staff> staffByLanguage = new HashSet<Staff>();

	public Language() {}
		
	public Language(Long iD, String language, Set<Staff> staffByLanguage) {
		super();
		this.id = iD;
		this.language = language;
		this.staffByLanguage = staffByLanguage;
	}

	@XmlTransient
	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
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
	
	public List<Long> getStaffByLanguageIds() {
		return EntityConverter.toIdList(staffByLanguage);
	}

	public void setStaffByLanguage(Set<Staff> staffByLanguage) {
		this.staffByLanguage = staffByLanguage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
