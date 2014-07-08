package org.wfp.fittest.dao;

import java.util.List;

import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;

public interface UtilityDao {
	
	/* ====================================================================== */
	// Country
	/* ====================================================================== */

	public List<Country> findAllCountries();
	
	public Country findCountryById(Integer countryID);
	
	public Country findCountryByISOCode(String code);
	
	public void saveCountry(Country country);
	
	/* ====================================================================== */
	// Language
	/* ====================================================================== */
	
	public List<Language> findAllLanguages();
	
	/* ====================================================================== */
	// Confirmed Type
	/* ====================================================================== */
	
	public List<ConfirmedType> findAllConfirmedTypes();
	
	public ConfirmedType findConfirmedTypeByConfirmedType(String confirmedType);
}
