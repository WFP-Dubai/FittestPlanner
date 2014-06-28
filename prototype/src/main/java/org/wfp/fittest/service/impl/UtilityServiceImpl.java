package org.wfp.fittest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.dao.UtilityDao;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.service.UtilityService;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
public class UtilityServiceImpl implements UtilityService {
	
	@Autowired
	private UtilityDao utilityDao;
	
	public UtilityServiceImpl() {
		
	}
	
	@Override
	public List<Country> findAllCountries() {
		return utilityDao.findAllCountries();
	}
	
	@Override
	public Country findCountryByISOCode(String ISOcode) {
		return utilityDao.findCountryByISOCode(ISOcode);
	}
	
	@Override
	public List<Language> findAllLanguages() {
		return utilityDao.findAllLanguages();
	}
}
