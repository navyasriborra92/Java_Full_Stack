package com.polymorphism;

public class Test {
	public static void main(String[] args) {
		Remote r = new Remote();
		r.turnOn();
		
		TvRemote t = new TvRemote();
				t.turnOn();
				
				t.turnOn();
				t.turnOff();
	}

}
