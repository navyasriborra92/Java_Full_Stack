package com.java;

public class Impl implements Interface2, FunctionalInterfaceOperation{

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye from if2");
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("Hi from func");
		
	}

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		FunctionalInterfaceOperation.super.defaultMethod();
	}
	

}
