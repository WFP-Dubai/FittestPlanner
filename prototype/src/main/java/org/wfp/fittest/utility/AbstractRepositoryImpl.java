package org.wfp.fittest.utility;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

public class AbstractRepositoryImpl<T, ID extends Serializable> extends
		SimpleJpaRepository<T, ID> implements AbstractRepository<T, ID> {

	private EntityManager entityManager;

	public AbstractRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.setEntityManager(entityManager);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
