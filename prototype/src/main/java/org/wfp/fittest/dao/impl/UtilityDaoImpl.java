package org.wfp.fittest.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.wfp.fittest.dao.UtilityDao;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;

@Repository
public class UtilityDaoImpl extends AbstractDaoImpl implements UtilityDao {

	@Override
	public List<Country> findAllCountries() {
		return findAll(Country.class);
	}

	@Override
	public Country findCountryById(Integer countryID) {
		return findById(Country.class, countryID);
	}
	
	@Override
	public void saveCountry(Country country) {
		saveOrUpdate(country);
	}
	
	@Override
	public Country findCountryByISOCode(String ISOcode) {
		return findOneByPropertyEqual(Country.class, "ISOCode", ISOcode);
	}

	@Override
	public List<Language> findAllLanguages() {
		return findAll(Language.class);
	}

	public List<ConfirmedType> findAllConfirmedTypes() {
		return findAll(ConfirmedType.class);
	}
	
	public ConfirmedType findConfirmedTypeByConfirmedType(String confirmedType) {
		return findOneByPropertyEqual(ConfirmedType.class, "confirmedType", confirmedType);
	}
	
}
