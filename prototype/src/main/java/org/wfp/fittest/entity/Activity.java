package org.wfp.fittest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activities")
public class Activity {

	@Id
	@Column(name = "id")
	private Integer id;
	
	// FK
	@Column(name = "activity")
	private Activity activity;
	
	@Column(name = "type")
	private String type;
	
	// FK
	@Column(name = "country")
	private Country country;
	
	@Column(name = "etcservicemap")
	private String etcServiceMap;
	
}
