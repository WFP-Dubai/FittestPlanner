package org.wfp.fittest.service;

import java.util.List;

import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;

public interface UtilityService {
	public List<Country> findAllCountries();

	public Country findCountryById(Integer countryID);
	
	public Country findCountryByISOCode(String ISOcode);
	
	public void saveCountry(Country country);

	public List<Language> findAllLanguages();
}
