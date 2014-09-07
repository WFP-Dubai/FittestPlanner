package org.wfp.fittest.utility;

/**
 * Miscallenous functions used to ease the development of JSP pages.
 *
 * @author Sami Zeinelabdin
 *
 */
public class ELUtility {

	private ELUtility() {

	}

	/**
	 * Converts a URL into list of capitalized, space separated words.
	 * @param text A URL
	 * @return A list of capitalized words separated by spaces.
	 */
	public static String linkToReadable(String text) {
		String[] xs = text.split("/");
		String result = "";
		for (String s : xs)
			result += capitalize(s) + " ";
		return result;
	}
	
	public static String capitalize(String text) {
		return text.substring(0, 1).toUpperCase()
				+ text.substring(1, text.length());
	}
}
