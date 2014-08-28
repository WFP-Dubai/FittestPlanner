package org.wfp.fittest.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "countries")
public interface CountryRepository extends AbstractRepository<Country, Long> {
	public Country findByIsoCode(String code);
}
