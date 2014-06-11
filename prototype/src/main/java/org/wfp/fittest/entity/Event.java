package org.wfp.fittest.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ID;
	
	@Column(name = "event")
	private String event;
	
	@Column(name = "startdate")
	private Timestamp startDate;
	
	@Column(name = "enddate")
	private Timestamp endDate;
	
	@Column(name = "colorcode")
	private String colorCode;
}
