package org.wfp.fittest.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "profileTypes")
public interface ProfileTypeRepository extends
		AbstractRepository<ProfileType, Long> {

	public ProfileType findById(@Param("id") Long id);
	
	public List<Staff> findByStaff_Id(@Param("staffId") Long staffId);

}
