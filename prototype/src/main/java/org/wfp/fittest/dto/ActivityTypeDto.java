package org.wfp.fittest.dto;

import java.util.List;

public class ActivityTypeDto extends AbstractDto {
	private Long id;
	private String activityType;
	private String colorCode;

	private List<Long> activityIds;

	private List<ActivityDto> activityDtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getColorCode() {
		return colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public List<ActivityDto> getActivityDtos() {
		return activityDtos;
	}

	public void setActivityDtos(List<ActivityDto> activityDtos) {
		this.activityDtos = activityDtos;
	}

	public List<Long> getActivityIds() {
		return activityIds;
	}

	public void setActivityIds(List<Long> activityIds) {
		this.activityIds = activityIds;
	}

	@Override
	public String toString() {
		return activityType;
	}

}
