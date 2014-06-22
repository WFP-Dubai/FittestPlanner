package org.wfp.fittest.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.wfp.fittest.entity.Activity;

@XmlRootElement
public class Activities {

	private Integer count;
	private List<Activity> activities;
	
	public Activities() {
		
	}
	
	public Activities(List<Activity> activities) {
		this.activities = activities;
	}
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
}
