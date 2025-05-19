package com.oops;

public class Bike {
	
	String colour;
	
	int speed;
	int gear;
	double petrolCapacity;
	
	void increaseGear() {
		gear++;
	}
	
	void increaseAcceleration() {
		speed += 20;
	}
	
	void applyBrakes() {
		gear--;
		speed -=10;
	}

}
