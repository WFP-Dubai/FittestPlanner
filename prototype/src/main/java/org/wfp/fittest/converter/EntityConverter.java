package org.wfp.fittest.converter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.wfp.fittest.entity.EntityId;

public class EntityConverter {

	private static final String BEAN_POSTFIX = "Dto";
	private static final String BEAN_NAMESPACE = "org.wfp.fittest.dto";
	private static final String ENTITY_NAMESPACE = "org.wfp.fittest.entity";

	public static <E extends EntityId> List<Long> toIdList(Iterable<E> entities) {
		List<Long> Ids = new ArrayList<Long>();
		for (EntityId entity : entities) {
			Ids.add(entity.getId());
		}
		return Ids;
	}

	@SuppressWarnings("all")
	public static <B, T extends EntityId> B toBean(T entity) {
		try {
			String simpleName = entity.getClass().getSimpleName();
			simpleName = simpleName.split("_")[0];
			String beanClassName = BEAN_NAMESPACE + "." + simpleName
					+ BEAN_POSTFIX;
			Class<B> beanClass = (Class<B>) Class.forName(beanClassName);
			B bean = beanClass.newInstance();
			BeanUtils.copyProperties(bean, entity);
			return bean;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public static <B, T extends EntityId> List<B> toBeanList(
			Iterable<T> entities) {
		List<B> beans = new ArrayList<B>();
		for (T entity : entities)
			beans.add((B) EntityConverter.toBean(entity));
		return beans;
	}

	@SuppressWarnings("unchecked")
	public static <B, T extends EntityId> T toEntity(B bean) {
		try {
			String beanClassName = bean.getClass().getSimpleName();
			String entityClassName = ENTITY_NAMESPACE
					+ "."
					+ beanClassName.substring(0, beanClassName.length()
							- BEAN_POSTFIX.length());
			Class<T> entityClass = (Class<T>) Class.forName(entityClassName);
			T entity = entityClass.newInstance();
			BeanUtils.copyProperties(entity, bean);
			return entity;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <B, T extends EntityId> Set<T> toEntityList(
			Iterable<B> beans) {
		Set<T> entities = new HashSet<T>();
		for (B bean : beans)
			entities.add((T) EntityConverter.toEntity(bean));
		return entities;
	}
}
