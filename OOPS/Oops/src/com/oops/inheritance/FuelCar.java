package com.oops.inheritance;

public class FuelCar extends Car {
	int fuelCapacity = 40;
	String color = "Red";
	
	public static void main(String[] args) {
		FuelCar fc = new FuelCar();
		System.out.println(fc.color);
		System.out.println(fc.fuelCapacity);
//		fc.fuel();
//		fc.car();
//		fc.start();
		
	}
	FuelCar(){
	this(10);
		System.out.println("FuelCar object created in this constructor ");
	}
	FuelCar(int fuel){
		this(20,"Grey");
		this.fuelCapacity =fuel;
	}
	FuelCar(int fuel,String color){
		this("Gold");
		this.fuelCapacity = fuel;
		this.color = color;
	}
	FuelCar(String color){
		this.color = color;
	}
	void fuel() {
		System.out.println("Fuel car... filling petrol");
		System.out.println(this.fuelCapacity);
		System.out.println(super.color);
		System.out.println(color);
	}

}
