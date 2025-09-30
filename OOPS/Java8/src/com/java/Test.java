package com.java;

public class Test{
	public static void main(String[] args) {
		Interface2 if2 = new Impl();
		if2.sayBye();
		if2.defaultMethod();
		Interface2.staticMethod();
	}
	

}
