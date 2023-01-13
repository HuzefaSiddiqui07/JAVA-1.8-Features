package com.defaultmethod;

/* Java provides a facility to create default methods inside the interface. 
Methods which are defined inside the interface and tagged with default are known as default methods. 
These methods are non-abstract methods. */

public interface DefaultMethod {

	default void m1() {
		System.out.println("This is default m1 Method");
	}

}
