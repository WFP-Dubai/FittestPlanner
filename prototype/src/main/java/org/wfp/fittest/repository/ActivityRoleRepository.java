package org.wfp.fittest.repository;

import java.util.Date;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.wfp.fittest.entity.ActivityRole;

public interface ActivityRoleRepository extends CrudRepository<ActivityRole, Integer> {
	public Set<ActivityRole> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(Date startDate, Date endDate);
}
