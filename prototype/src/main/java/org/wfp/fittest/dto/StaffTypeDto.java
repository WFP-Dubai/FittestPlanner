package org.wfp.fittest.dto;

import java.util.ArrayList;
import java.util.List;

public class StaffTypeDto extends AbstractDto {
	private Long id;
	private String staffType;
	
	private List<StaffDto> staffDtos = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStaffType() {
		return staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	public List<StaffDto> getStaffDtos() {
		return staffDtos;
	}

	public void setStaffDtos(List<StaffDto> staffDtos) {
		this.staffDtos = staffDtos;
	}
	
	@Override
	public String toString() {
		return staffType;
	}
	
}
