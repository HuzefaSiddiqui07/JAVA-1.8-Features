package com.javastringjoiner;

import java.util.StringJoiner;

/* Java added a new final class StringJoiner in java.util package. 
It is used to construct a sequence of characters separated by a delimiter. 
Now, you can create string by passing delimiters like comma(,), hyphen(-) etc */

public class JavaStringJoiner {

	public static void main(String[] args) {

		StringJoiner stringJoiner = new StringJoiner(","); // passing comma(,) as delimiter

		stringJoiner.add("Huzefa");
		stringJoiner.add("Sujit");
		stringJoiner.add("Priyanka");
		stringJoiner.add("Mayuri");

		System.out.println(stringJoiner);

	}

}
