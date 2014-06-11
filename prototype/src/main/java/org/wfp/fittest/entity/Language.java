package org.wfp.fittest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {

	@Id
	@Column(name = "language")
	private String language;
	
	@ManyToMany(mappedBy = "languages")
	private List<Staff> staffByLanguage;
}
