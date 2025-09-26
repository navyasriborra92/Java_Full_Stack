package com.polymorphism;

public class TvRemote extends Remote{
	
	@Override
	void turnOn() {
		System.out.println("Tv turn on..");
	}
	
	//Method Hiding
	static void turnOff() {
		System.out.println("TV turn off...");
	}
	
	

}
