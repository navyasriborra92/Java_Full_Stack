package com.oops.inheritance;

public class Car extends Vehicle{
	
	String color = "black";
	
	public Car() {
		System.out.println("Car object created in this constructor");
	}
	
	void car() {
		System.out.println(super.color);
		System.out.println(color);
		System.out.println("Car is crusing....");
	}

}
