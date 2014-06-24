package org.wfp.fittest.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

public interface AbstractDao {

	public Session getCurrentSession();

	public <E> Criteria createCriteria(Class<E> entityClass);

	public <E, I extends Serializable> E findById(Class<E> entityClass, I id);

	public <E> List<E> findAll(Class<E> entityClass);

	public <E> List<E> findByCriteria(Criteria criterion);

	public <E> E findOneByCriteria(Class<E> entityClass, Criterion criterion);

	public <E> List<E> findByCriteria(Class<E> entityClass, Criterion criterion);

	public <E> E findOneByPropertyEqual(Class<E> entityClass,
			String propertyName, Object propertyValue);

	public <E> List<E> findByPropertyEqual(Class<E> entityClass,
			String propertyName, Object propertyValue);

	public <E> List<E> findByPropertyGreaterThanOrEqual(Class<E> entityClass,
			String propertyName, Object propertyValue);

	public <E> List<E> findByStartDateAfter(Class<E> entityClass, Date startDate);

	public <E> List<E> findByPropertyLessThanOrEqual(Class<E> entityClass,
			String propertyName, Object propertyValue);

	public <E> List<E> findByEndDateBefore(Class<E> entityClass, Date endDate);

	public <E> List<E> findByPropertiesInRange(Class<E> entityClass,
			String lowerName, Object lowerValue, String upperName,
			Object upperValue);

	public <E> List<E> findByDuration(Class<E> entityClass, Date startDate,
			Date endDate);
	
	public <E> List<E> findByDurationAround(Class<E> entityClass, Date fromDate);

	public <E> void saveOrUpdate(E entity);

	public <E> void delete(E entity);

	public <E, I extends Serializable> void deleteById(Class<E> entityClass,
			I id);

	public <E> void deleteAll(Class<E> entityClass);

	public <E> void deleteAll(List<E> entities);

	public <E> void deleteByPropertyEqual(Class<E> entityClass,
			String propertyName, Object propertyValue);

}
