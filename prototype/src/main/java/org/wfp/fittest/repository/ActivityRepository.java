package org.wfp.fittest.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "activities")
public interface ActivityRepository extends AbstractRepository<Activity, Long> {

	public Activity findById(@Param("id") Long id);
	
	public List<Activity> findByConfirmedType_Id(
			@Param("confirmedTypeId") Long confirmedTypeId, Pageable p);

	public List<Activity> findByConfirmedType_ConfirmedType(
			@Param("confirmedType") String confirmedType);

	public List<Activity> findByConfirmedType(ConfirmedType confirmedType);

	public List<Activity> findByActivityType_Id(
			@Param("activityTypeId") Long activityTypeId);

	public List<Activity> findByActivityType_ActivityType(
			@Param("activityType") String activityType);

	public List<Activity> findByActivityType(ActivityType activityType);

	public List<Activity> findByDescription(String description);

//	public void deleteByActivityType(ActivityType activityType);
//
//	public void deleteByDescription(String description);

}
