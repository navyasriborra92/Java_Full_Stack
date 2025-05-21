package com.abstraction;

public interface B {
	public void m1();
	
	public void m3();
	
	
	default void m4() {
		System.out.println("Hi from default method");
	}

}
