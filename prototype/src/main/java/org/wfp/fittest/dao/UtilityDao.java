package org.wfp.fittest.dao;

import java.util.List;

import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;

public interface UtilityDao {
	
	/* ====================================================================== */
	// Country
	/* ====================================================================== */

	public List<Country> findAllCountries();
	
	/* ====================================================================== */
	// Language
	/* ====================================================================== */
	
	public List<Language> findAllLanguages();
}
