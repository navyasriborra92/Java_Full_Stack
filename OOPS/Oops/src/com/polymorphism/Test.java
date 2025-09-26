package com.polymorphism;

public class Test {
	public static void main(String[] args) {
		Remote r = new Remote();
		r.turnOn();
		
		Remote rem = new TvRemote();
		rem.turnOn();
		
		TvRemote t = new TvRemote();
				t.turnOn();
				
				t.turnOn();
				t.turnOff();
				
				
	}

}
