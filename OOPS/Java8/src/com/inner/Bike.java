package com.inner;

public class Bike extends Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Satrted Bike");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopped Bike");
	}
	
	public void drive() {
		System.out.println("Bike Drive");
	}

}
