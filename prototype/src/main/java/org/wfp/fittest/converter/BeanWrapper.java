package org.wfp.fittest.converter;

import java.util.HashMap;

public class BeanWrapper<B> extends HashMap<String, B> {

	private static final long serialVersionUID = -5878301834777736695L;

	public BeanWrapper() {
		
	}
	
	public BeanWrapper(String wrapperName, B bean) {
		put(wrapperName, bean);
	}
}
