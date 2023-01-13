package com.functionalinterface;

public class MainFunctional implements Functional_Interface {

	@Override
	public void getStudentName(String name) {

		System.out.println(name);

	}

	public static void main(String[] args) {

		// Create an Object
		MainFunctional mFunctional = new MainFunctional();

		// Call method by Object
		mFunctional.getStudentName("Huzefa");

	}

}
