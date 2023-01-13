package com.functionalinterface;

/* Functional Interface :
An Interface that contains exactly one abstract method is known as  functional interface. */

@FunctionalInterface
public interface Functional_Interface {

	// Abstract Method

	public abstract void getStudentName(String name);

	// Note: It can have any number of default, static methods but can contain only
	// one abstract method.

}
