package com.util;

public class Validator {

	public static boolean isBlank(String data) {
		if (data == null || data.trim().length() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isAlpha(String data) {
		String regEx = "[a-zA-Z]+";// min:1 , max:n

		if (data.matches(regEx) == true) {
			return true;
		} else {
			return false;
		}
	}
}
