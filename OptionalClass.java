package com.optionalclass;

/* Java introduced a new class Optional in jdk8. 
It is a public final class and used to deal with NullPointerException in Java application.

You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable. */

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String[] str = new String[10];

		Optional<String> checkNull = Optional.ofNullable(str[5]);

		if (checkNull.isPresent()) {

			String lowerCaseString = str[5].toLowerCase();
			System.out.println(lowerCaseString);

		} else {

			System.out.println("String Value is Not Present");

		}

	}

}
