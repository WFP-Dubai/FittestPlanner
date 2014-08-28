package org.wfp.fittest.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "activityTypes")
public interface ActivityTypeRepository extends
		AbstractRepository<ActivityType, Long> {

	public List<ActivityType> findByActivityType(String activityType);

	public List<ActivityType> findByColorCode(String colorCode);
	
	public List<ActivityType> findByActivities_Id(@Param("activityId") Long activityId);

	public void deleteByActivityType(String activityType);

	public void deleteByColorCode(String colorCode);
}
