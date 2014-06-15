package org.wfp.fittest.repository;

import java.util.Date;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.StaffRole;

public interface StaffRoleRepository extends CrudRepository<StaffRole, Integer> {
	public Set<StaffRole> findByStartDateGreaterThanEqual(Date startDate);
	public Set<StaffRole> findByEndDateLessThanEqual(Date endDate);
	public Set<StaffRole> findByStartDateGreaterThanEqualAndEndDateLessThanEqual(Date startDate, Date endDate);
}
