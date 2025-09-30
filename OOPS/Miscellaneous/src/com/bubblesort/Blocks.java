package com.bubblesort;

public class Blocks {
	static int x = 2;
	int y = 4;
	public static void main(String[] args) {
		System.out.println("main method");
		Blocks b = new Blocks();
		Blocks c = new Blocks();
		
	}
	static {
		System.out.println("Static block");
		x = 8;
	}
	
	{
		x= 0;
		y= 7;
		System.out.println("Instance block");
	}
	
	public Blocks() {
		System.out.println("inside constructor");
	}
	
	static {
		x= 0;
//		y= 7;
		System.out.println("Static block2");
	}
	

}
