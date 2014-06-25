package org.wfp.fittest.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.wfp.fittest.dao.UtilityDao;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;

@Repository
public class UtilityDaoImpl extends AbstractDaoImpl implements UtilityDao {

	@Override
	public List<Country> findAllCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country findCountryByISOCode(String ISOcode) {
		return findOneByPropertyEqual(Country.class, "ISOCode", ISOcode);
	}

	@Override
	public List<Language> findAllLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

}