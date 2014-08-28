package org.wfp.fittest.utility;

public class ELUtility {

	private ELUtility() {

	}

	public static String linkToReadable(String text) {
		String[] xs = text.split("/");
		String result = "";
		for (String s : xs)
			result += capitalize(s) + " ";
		return result;
	}
	
	public static String hello() {
		return "TEST";
	}
	
	public static String capitalize(String text) {
		return text.substring(0, 1).toUpperCase()
				+ text.substring(1, text.length());
	}
}
