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
public class Event implements EntityId {

	@Id
	@Column(name = "eventid")
	@SequenceGenerator(allocationSize=1, initialValue=1, sequenceName="events_eventid_seq", name="events_eventid_seq")
	@GeneratedValue(generator = "events_eventid_seq", strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "event")
	private String event;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eventstartdate")
	private Date startDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "eventenddate")
	private Date endDate;
	
	@Column(name = "eventcolorcode")
	private String colorCode;

	public Event() {}
	
	public Event(Long iD, String event, Date startDate, Date endDate,
			String colorCode) {
		super();
		this.id = iD;
		this.event = event;
		this.startDate = startDate;
		this.endDate = endDate;
		this.colorCode = colorCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long iD) {
		this.id = iD;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
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
		Event other = (Event) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
