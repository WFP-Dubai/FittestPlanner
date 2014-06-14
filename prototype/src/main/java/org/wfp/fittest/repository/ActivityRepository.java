package org.wfp.fittest.repository;

import org.springframework.data.repository.CrudRepository;
import org.wfp.fittest.entity.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {

}
