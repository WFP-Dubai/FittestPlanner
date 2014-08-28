package org.wfp.fittest.utility;

import java.util.List;

import org.wfp.fittest.converter.BeanListWrapper;
import org.wfp.fittest.converter.BeanWrapper;

public class JsonUtility {
	public static <B> BeanWrapper<B> beanWrapper(String wrapperName, B bean) {
		return new BeanWrapper<B>(wrapperName, bean);
	}

	public static <B> BeanListWrapper<B> toBeanListWrapper(String wrapperName,
			Iterable<B> entities) {
		BeanListWrapper<B> wrapper = new BeanListWrapper<B>();
		wrapper.put(wrapperName, (List<B>) entities);
		return wrapper;
	}
}
