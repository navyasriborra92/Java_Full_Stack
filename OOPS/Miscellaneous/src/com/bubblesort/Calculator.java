package com.bubblesort;

public class Calculator {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(10, 20);
		c.sum(10,20,30);
	}

//	private void sum(int i, int j, int k) {
//		// TODO Auto-generated method stub
//		int sum = i+j+k;
//		System.out.println(sum);
//	}
//
//	public void sum(int a, int b) {
//		int sum = a+b;
//		System.out.println(sum);
//	}
	
	//cannot use multiple params, if used var args should be last param
	public void sum(int... in) {
		int sum =0;
		for(int a :in) {
			 sum+= a;
		}
		System.out.println(sum);
	}
}
