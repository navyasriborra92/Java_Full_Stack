package com.java;

@FunctionalInterface
public interface FunctionalInterfaceOperation {
	
	void hi();
	
	default void defaultMethod() {
		System.out.println("func default");
	}

}
