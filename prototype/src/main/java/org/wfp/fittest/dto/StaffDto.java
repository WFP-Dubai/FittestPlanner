package org.wfp.fittest.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffDto extends AbstractDto {

	private Long id;
	private String firstName;
	private String lastName;
	private String name;
	private Date dateOfBirth;
	private String title;
	private String thuraya;
	private String mobile;
	private String staffColorCode;

	private String staffTypeDescription;
	private List<String> profileTypeDescriptions;

	private Long staffTypeId;
	private List<Long> profileTypeIds = new ArrayList<Long>();
	private List<Long> nationalityIds = new ArrayList<Long>();
	private List<Long> languageIds = new ArrayList<Long>();
	private List<Long> staffRoleIds = new ArrayList<Long>();
	
	private StaffTypeDto staffTypeDto;
	private List<ProfileTypeDto> profileTypeDtos;
	private List<CountryDto> nationalityDtos;
	private List<LanguageDto> languageDtos;
	private List<StaffRoleDto> staffRoleDtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThuraya() {
		return thuraya;
	}

	public void setThuraya(String thuraya) {
		this.thuraya = thuraya;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getStaffColorCode() {
		return staffColorCode;
	}

	public void setStaffColorCode(String staffColorCode) {
		this.staffColorCode = staffColorCode;
	}

	public String getStaffTypeDescription() {
		return staffTypeDescription;
	}

	public void setStaffTypeDescription(String staffTypeDescription) {
		this.staffTypeDescription = staffTypeDescription;
	}

	public List<String> getProfileTypeDescriptions() {
		return profileTypeDescriptions;
	}

	public void setProfileTypeDescriptions(List<String> profileTypeDescriptions) {
		this.profileTypeDescriptions = profileTypeDescriptions;
	}
		
	public Long getStaffTypeId() {
		return staffTypeId;
	}

	public void setStaffTypeId(Long staffTypeId) {
		this.staffTypeId = staffTypeId;
	}

	public List<Long> getProfileTypeIds() {
		return profileTypeIds;
	}

	public void setProfileTypeIds(List<Long> profileTypeIds) {
		this.profileTypeIds = profileTypeIds;
	}

	public List<Long> getNationalityIds() {
		return nationalityIds;
	}

	public void setNationalityIds(List<Long> nationalityIds) {
		this.nationalityIds = nationalityIds;
	}

	public List<Long> getLanguageIds() {
		return languageIds;
	}

	public void setLanguageIds(List<Long> languageIds) {
		this.languageIds = languageIds;
	}

	public List<Long> getStaffRoleIds() {
		return staffRoleIds;
	}

	public void setStaffRoleIds(List<Long> staffRoleIds) {
		this.staffRoleIds = staffRoleIds;
	}

	public StaffTypeDto getStaffTypeDto() {
		return staffTypeDto;
	}

	public void setStaffTypeDto(StaffTypeDto staffTypeDto) {
		this.staffTypeDto = staffTypeDto;
	}

	public List<ProfileTypeDto> getProfileTypeDtos() {
		return profileTypeDtos;
	}

	public void setProfileTypeDtos(List<ProfileTypeDto> profileTypeDtos) {
		this.profileTypeDtos = profileTypeDtos;
	}

	public List<CountryDto> getNationalityDtos() {
		return nationalityDtos;
	}

	public void setNationalityDtos(List<CountryDto> nationalityDtos) {
		this.nationalityDtos = nationalityDtos;
	}

	public List<LanguageDto> getLanguageDtos() {
		return languageDtos;
	}

	public void setLanguageDtos(List<LanguageDto> languageDtos) {
		this.languageDtos = languageDtos;
	}

	public List<StaffRoleDto> getStaffRoleDtos() {
		return staffRoleDtos;
	}

	public void setStaffRoleDtos(List<StaffRoleDto> staffRoleDtos) {
		this.staffRoleDtos = staffRoleDtos;
	}

	@Override
	public String toString() {
		return name;
	}
}
