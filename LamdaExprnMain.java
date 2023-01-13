package com.lambdaexpression;

public class LamdaExprnMain {

	public static void main(String[] args) {

		// Multiple parameters in lambda expression
		LamdaExprnAddition addition1 = (a, b) -> (a + b);
		System.out.println(addition1.add(10, 20));

		// Multiple parameters with DataTypes in lambda expression
		LamdaExprnAddition addition2 = (int a, int b) -> (a + b);
		System.out.println(addition2.add(100, 200));

	}

}
