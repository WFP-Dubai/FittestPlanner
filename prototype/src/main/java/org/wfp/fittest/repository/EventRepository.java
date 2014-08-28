package org.wfp.fittest.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.Event;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "events")
public interface EventRepository extends AbstractRepository<Event, Long> {

	public List<Event> findByStartDateGreaterThanEqual(Date startDate);

	public List<Event> findByEndDateLessThanEqual(Date endDate);

	public List<Event> findByEvent(String eventName);

	public void deleteByEvent(String eventName);
}
