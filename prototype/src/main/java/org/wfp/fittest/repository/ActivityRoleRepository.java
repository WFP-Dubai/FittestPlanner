package org.wfp.fittest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "activityRoles")
public interface ActivityRoleRepository extends
		AbstractRepository<ActivityRole, Long> {

	@Query("select ar from ActivityRole ar where ar.id = :id")
	public List<Staff> findById(@Param("id") Long id);

	@Query("select ar from ActivityRole ar where ar.id in :ids")
	public List<ActivityRole> findByIds(@Param("ids") List<Long> ids);

	public List<ActivityRole> findByActivity_Id(
			@Param("activityId") Long activityId, Pageable p);

	@Query("select ar from ActivityRole ar"
			+ " where ((ar.startDate >= :startDate and ar.endDate <= :endDate)"
			+ " or (ar.startDate <= :startDate and (ar.endDate >= :startDate and ar.endDate <= :endDate))"
			+ " or ((ar.startDate >= :startDate and ar.startDate <= :endDate) and ar.endDate >= :endDate)"
			+ " or (ar.startDate <= :startDate and ar.endDate >= :endDate))"
			+ " and ar.activity.id in :activityIds"
			+ " order by ar.activity.description, ar.profileType.profileType")
	List<ActivityRole> findRequirements(
			@Param("startDate") @DateTimeFormat(iso = ISO.DATE) Date startDate,
			@Param("endDate") @DateTimeFormat(iso = ISO.DATE) Date endDate,
			@Param("activityIds") List<Long> activityIds);

	@Query("select ar from ActivityRole ar "
			+ " join ar.profileType pt"
			+ " join ar.activity act"
			+ " where (pt.id = :profileTypeId)"
			+ " and (act.id = :activityId)"
			+ " and (ar.location like :location)")
	public List<ActivityRole> findByActivityIdAndProfileTypeId(
			@Param("activityId") Long activityId,
			@Param("profileTypeId") Long profileTypeId,
			@Param("location") String location);

	public List<ActivityRole> findByStartDateAfter(Date startDate);

	public List<ActivityRole> findByEndDateBefore(Date endDate);

	public List<ActivityRole> findByStartDateBetween(Date startDate,
			Date endDate);

	public List<ActivityRole> findByEndDateBetween(Date startDate, Date endDate);

	public List<ActivityRole> findByLocation(String activityRoleLocation);

	public void deleteByLocation(String activityRoleLocation);
}
