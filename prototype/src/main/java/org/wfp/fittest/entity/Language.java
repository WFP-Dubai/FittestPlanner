package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Language {

	@Id
	@Column(name = "language")
	private String language;
}
