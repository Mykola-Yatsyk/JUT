package com.softserve.java.test;

import java.util.regex.Pattern;

public class Utils {
	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("[a-zA-Z]{1}[a-zA-Z0-9.]{1,}[a-zA-Z]{1}@[a-zA-Z]{1}[a-zA-Z.]{1,}[a-zA-Z]{2,}");

	public boolean checkEmail(String text) {
		return VALID_EMAIL_ADDRESS_REGEX.matcher(text).matches();
	}
}