package org.wfp.fittest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "events")
public class Event {

	@Id
	@Column(name = "eventid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="events_eventid_seq", name="events_eventid_seq")
	@GeneratedValue(generator = "events_eventid_seq", strategy=GenerationType.SEQUENCE)
	private Integer ID;
	
	@Column(name = "event")
	private String event;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "startdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "colorcode")
	private String colorCode;
}
