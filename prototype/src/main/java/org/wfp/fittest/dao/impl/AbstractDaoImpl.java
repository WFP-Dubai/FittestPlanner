package org.wfp.fittest.dao.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.dao.AbstractDao;

@Repository
public abstract class AbstractDaoImpl implements AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public <E> Criteria createCriteria(Class<E> entityClass) {
		return getCurrentSession().createCriteria(entityClass);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E, I extends Serializable> E findById(Class<E> entityClass, I id) {
		return (E) getCurrentSession().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> List<E> findAll(Class<E> entityClass) {
		Criteria criteria = createCriteria(entityClass);
		return criteria.list();
	}

	@Override
	public <E> List<E> findByPropertyEqual(Class<E> entityClass,
			String propertyName, Object propertyValue) {
		Criterion criterion = Restrictions.eq(propertyName, propertyValue);
		return findByCriteria(entityClass, criterion);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> List<E> findByCriteria(Criteria criteria) {
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <E> List<E> findByCriteria(Class<E> entityClass, Criterion criterion) {
		Criteria criteria = createCriteria(entityClass);
		criteria.add(criterion);
		return criteria.list();
	}

	@Override
	public <E> List<E> findByStartDateAfter(Class<E> entityClass, Date startDate) {
		Criterion criterion = Restrictions.ge("startDate", startDate);
		return findByCriteria(entityClass, criterion);
	}

	@Override
	public <E> List<E> findByEndDateBefore(Class<E> entityClass, Date endDate) {
		Criterion criterion = Restrictions.le("endDate", endDate);
		return findByCriteria(entityClass, criterion);
	}

	@Override
	public <E> List<E> findByDuration(Class<E> entityClass, Date startDate,
			Date endDate) {
		Criteria criteria = createCriteria(entityClass);
		criteria.add(Restrictions.ge("startDate", startDate));
		criteria.add(Restrictions.le("endDate", endDate));
		return findByCriteria(criteria);
	}

	@Override
	public <E> void saveOrUpdate(E entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public <E> void delete(E entity) {
		getCurrentSession().delete(entity);
	}

	@Override
	public <E, I extends Serializable> void deleteById(Class<E> entityClass,
			I id) {
		delete(findById(entityClass, id));
	}

	@Override
	public <E> void deleteAll(Class<E> entityClass) {
		deleteAll(findAll(entityClass));
	}

	@Override
	public <E> void deleteAll(List<E> entities) {
		Iterator<?> itr = entities.iterator();
		while (itr.hasNext()) {
			delete(itr.next());
		}
	}

	@Override
	public <E> void deleteByPropertyEqual(Class<E> entityClass,
			String propertyName, Object propertyValue) {
		deleteAll(findByPropertyEqual(entityClass, propertyName, propertyValue));
	}
}
