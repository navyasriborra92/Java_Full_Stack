package com.oops;

public class Test {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		myBike.colour = "White";
		myBike.gear =0;
		myBike.speed = 0;
		myBike.petrolCapacity = 12;
		
		System.out.println("My Bike colour " + myBike.colour);
		System.out.println("My Bike gear " + myBike.gear);
		System.out.println("My Bike speed " + myBike.speed);
		System.out.println("My Bike petrol Capacity " + myBike.petrolCapacity);
		
		myBike.increaseGear();
		System.out.println("My Bike gear " + myBike.gear);
		
		myBike.increaseAcceleration();
		System.out.println("My Bike speed " + myBike.speed);
		
		myBike.increaseGear();
		System.out.println("My Bike gear " + myBike.gear);
		
		myBike.increaseAcceleration();
		System.out.println("My Bike speed " + myBike.speed);
		
		myBike.increaseGear();
		System.out.println("My Bike gear " + myBike.gear);
		
		myBike.increaseAcceleration();
		System.out.println("My Bike speed " + myBike.speed);
		
		myBike.applyBrakes();
		System.out.println("My Bike gear " + myBike.gear);
		System.out.println("My Bike speed " + myBike.speed);
		
		Bike friendBike = new Bike();
		friendBike.colour = "White";
		friendBike.gear =0;
		friendBike.speed = 0;
		friendBike.petrolCapacity = 12;
		}
}
