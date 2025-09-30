package com.inner;

public class Test {

	public static void main(String[] args) {
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
		bike.drive();
		
		Vehicle lorry = new Vehicle() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Started Lorry");
			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub
				System.out.println("Stopped Lorry");
			}
			
			public void drive() {
				System.out.println("Lorry Drive");
			}
			
		};
		lorry.start();
		lorry.stop();
		lorry.drive();
	}
}
