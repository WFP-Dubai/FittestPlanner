package org.wfp.fittest.entity;

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
	
	@ManyToMany(mappedBy = "languages", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Staff> staffByLanguage;
}
