package org.wfp.fittest.dto;

import java.util.ArrayList;
import java.util.List;

public class LanguageDto extends AbstractDto {
	private Long id;
	private String language;
	
	private List<Long> staffByLanguageIds;
	
	private List<StaffDto> staffByLanguageDtos = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Long> getStaffByLanguageIds() {
		return staffByLanguageIds;
	}

	public void setStaffByLanguageIds(List<Long> staffByLanguageIds) {
		this.staffByLanguageIds = staffByLanguageIds;
	}
	
	public List<StaffDto> getStaffByLanguageDtos() {
		return staffByLanguageDtos;
	}

	public void setStaffByLanguageDtos(List<StaffDto> staffByLanguageDtos) {
		this.staffByLanguageDtos = staffByLanguageDtos;
	}

	@Override
	public String toString() {
		return language;
	}

}
