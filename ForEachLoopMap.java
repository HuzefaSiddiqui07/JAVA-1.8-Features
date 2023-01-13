package com.foreachloop;

/* The Java forEach() method is a utility function to iterate over a collection such as (list, set or map) and stream. 
It is used to perform a given action on each the element of the collection. */

import java.util.HashMap;
import java.util.Map;

public class ForEachLoopMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "Sujit");
		map.put("2", "Priyanka");
		map.put("3", "Mayuri");

		map.forEach((k, v) -> System.out.println("Key = " + k + ",Value = " + v));

	}

}
