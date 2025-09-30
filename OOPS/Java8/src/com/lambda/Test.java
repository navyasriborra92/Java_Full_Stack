package com.lambda;

public class Test {
	
	
	public static void main(String[] args) {
		Vehicle car = () -> System.out.println("started  car");
		
		Vehicle car1 = ()->{
			for(int i=0 ; i<5 ; i++) {
				System.out.println(i);
			}
		};
		
		car.start();
		car1.start();
		
		Calculator c = (int a, int b)-> {
//			System.out.println(a+b);
			return a+b;
		};
		int i = c.add(10, 20);
		System.out.println(i);
	}


}
