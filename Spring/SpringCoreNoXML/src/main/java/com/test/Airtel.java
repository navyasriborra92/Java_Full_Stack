package com.test;

import org.springframework.stereotype.Component;

import com.interf.Sim;

@Component
public class Airtel implements Sim{

	public void call() {
		// TODO Auto-generated method stub
		System.out.println("Caliing sim from Airtel");
	}

}
