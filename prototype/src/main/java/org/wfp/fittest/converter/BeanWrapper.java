package org.wfp.fittest.converter;

import java.util.HashMap;

/**
 * BeanWrapper is a wrapper class used to associate a string description with
 * a Bean. This is used when serializing a bean to JSON, providing a bean with
 * a descriptive tag.
 * <p>
 * After serialization, the resulting JSON is in the format
 * <pre>
 * { "tag" : { "id" : 1, ... } }
 * </pre>
 * @author Sami Zeinelabdin
 */
public class BeanWrapper<B> extends HashMap<String, B> {

	private static final long serialVersionUID = -5878301834777736695L;

	public BeanWrapper() {
		
	}
	
	public BeanWrapper(String wrapperName, B bean) {
		put(wrapperName, bean);
	}
}
