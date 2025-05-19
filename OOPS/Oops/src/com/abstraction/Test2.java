package com.abstraction;

public class Test2 {

	public static void main(String[] args) {
		
		Sim sim1 = new Jio();
		System.out.println("Jio Number " + sim1.adhaarNum());
		System.out.println(sim1.IMEI());
		System.out.println(sim1.number());
		
		
		Sim sim = new Bsnl();
		System.out.println("BSNL Number " + sim.adhaarNum());
		System.out.println(sim.IMEI());
		System.out.println(sim.number());
		int num = sim.a;
		System.out.println(num);
	}
}
