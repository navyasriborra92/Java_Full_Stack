package com.java;

public interface Interface2 {

	void sayBye();
	
	default void defaultMethod() {
		System.out.println("inf2default");
	}
	
	static void staticMethod() {
		System.out.println("inf2 static");
	}
}
