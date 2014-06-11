package org.wfp.fittest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wfp.fittest.entity.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Integer> {

}
