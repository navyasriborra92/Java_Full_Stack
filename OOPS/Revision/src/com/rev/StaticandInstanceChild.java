package com.rev;

public class StaticandInstanceChild extends StaticandInstance {

	public static void main(String[] args) {
		StaticandInstanceChild a = new StaticandInstanceChild();
		
		StaticandInstanceChild b = new StaticandInstanceChild(1,2);
		
		StaticandInstance c = new StaticandInstanceChild();
		
		StaticandInstance d = new StaticandInstanceChild(2,3);
	}
	
	public StaticandInstanceChild() {
		System.out.println("child main constructor");
	}
	
	public StaticandInstanceChild(int a, int b) {
		this();
		System.out.println("child fields constructor");
	}
	
	static {
		System.out.println("Static block");
	}
	
	{
		System.out.println("Instance block");
	}
}
