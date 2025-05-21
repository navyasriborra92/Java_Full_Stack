package com.abstraction;

public class Test2 {

	public static void main(String[] args) {
		
		Jio j = new Jio();
		System.out.println("Jio Number from child variable  " + j.adhaarNum());
		System.out.println(j.IMEI());
		System.out.println(j.number());
		
		Bsnl b = new Bsnl();
		System.out.println("Jio Number from child variable  " + b.adhaarNum());
		System.out.println(b.IMEI());
		System.out.println(b.number());

		//parent reference variable holding a child class object 
		
		Jio jsim = new Jio();
		System.out.println("Jio Number from parent variable   " + jsim.adhaarNum());
		System.out.println(jsim.IMEI());
		System.out.println(jsim.number());
		
		Sim sim = new Bsnl();
		System.out.println("BSNL Number parent variable  " + sim.adhaarNum());
		System.out.println(sim.IMEI());
		System.out.println(sim.number());
		
		///the 
		int num1 = sim.a;
		int num = Sim.a;
		System.out.println(num);
		System.out.println(num1);
	}
}
