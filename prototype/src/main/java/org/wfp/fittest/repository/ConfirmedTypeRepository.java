package org.wfp.fittest.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "confirmedTypes")
public interface ConfirmedTypeRepository extends
		AbstractRepository<ConfirmedType, Long> {

	public ConfirmedType findById(@Param("id") Long id);
	
	public List<ConfirmedType> findByConfirmedType(String confirmedType);
	
	public List<ConfirmedType> findByActivities_Id(@Param("activityId") Long activityId);

	public List<ConfirmedType> findByStaffRoles_Id(@Param("staffRoleId") Long staffRoleId);
}
