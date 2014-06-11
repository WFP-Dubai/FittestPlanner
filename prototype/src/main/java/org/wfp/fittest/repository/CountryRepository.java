package org.wfp.fittest.repository;

import org.springframework.data.repository.CrudRepository;
import org.wfp.fittest.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

}
