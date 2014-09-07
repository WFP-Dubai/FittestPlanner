package org.wfp.fittest.converter;

import java.util.HashMap;
import java.util.List;

/**
 * BeanListWrapper is a wrapper class used to associate a string description with
 * a Bean List. This is used when serializing a list of beans to JSON, providing them
 * with a descriptive tag.
 * <p>
 * After serialization, the resulting JSON is in the format
 * <pre>
 * { "tag" : [{ "id": 1, ... }, { "id": 2, ... }, ... ] }
 * </pre>
 * @author Sami Zeinelabdin
 * @param <B> A Java Bean
 */
public class BeanListWrapper<B> extends HashMap<String, List<B>> {

	private static final long serialVersionUID = -2794950607455834732L;

	public BeanListWrapper() {
		
	}
}
