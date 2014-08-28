package org.wfp.fittest.service;

import java.util.List;

import org.wfp.fittest.dto.ConfirmedTypeDto;
import org.wfp.fittest.dto.CountryDto;
import org.wfp.fittest.dto.LanguageDto;

public interface UtilityService {
	public List<CountryDto> findAllCountries();
	
	public CountryDto findCountryById(Long countryId);
	
	public CountryDto saveOrUpdateCountry(CountryDto countryDto);
	
	public boolean deleteCountryById(Long countryId);
	
	public List<LanguageDto> findAllLanguages();
	
	public LanguageDto findLanguageById(Long languageId);
	
	public LanguageDto saveOrUpdateLanguage(LanguageDto languageDto);
	
	public boolean deleteLanguageById(Long languageId);
	
	public List<ConfirmedTypeDto> findAllConfirmedTypes();

	public ConfirmedTypeDto findConfirmedTypeNested(Long confirmedTypeId);

	public boolean deleteConfirmedTypeById(Long confirmedTypeId);

	public ConfirmedTypeDto saveOrUpdateConfirmedType(ConfirmedTypeDto confirmedTypeDto);
}
