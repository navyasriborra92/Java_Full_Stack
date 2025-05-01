package com.strings;

public class Nested_Loops {
	public static void main(String[] args) {
		Nested_Loops nl = new Nested_Loops();
		//nl.nestedLoop1();
		//nl.nestedLoop2();
		//nl.nestedLoop3();
		//nl.nestedLoop4();
		//nl.nestedLoop5();
		//nl.nestedLoop6();
		//nl.nestedLoop7();
		//nl.nestedLoop8();
		//nl.nestedLoop9();
		nl.nestedLoop10();
		
	}

	void nestedLoop1() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
			}
		}
	}
	
	void nestedLoop2() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
			}
			System.out.println("i " + i);
		}
	}
	
	void nestedLoop3() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
				break;
			}
			System.out.println("i " + i);
		}
	}
	
	void nestedLoop4() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
				continue;
			}
			System.out.println("i " + i);
		}
	}
	
	void nestedLoop5() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
			}
			System.out.println("i " + i);
			break;
		}
	}
	
	void nestedLoop6() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
			}
			System.out.println("i " + i);
			continue;
		}
	}
	
	void nestedLoop7() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				System.out.println("i " + i+ " j " + j);
				if(i==3 && j ==3) {
					break;
				}
			}
			System.out.println("i " + i);
		}
	}
	
	void nestedLoop8() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
				if(i==3 && j ==3) {
					System.out.println("i " + i+ " j " + j);
					break;
				}
			}
			System.out.println("i " + i);
		}
	}
	
	void nestedLoop9() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
					System.out.println("i " + i+ " j " + j);
			}
			if( i ==3) {
			System.out.println("i " + i);
			break;
			}
		}
	}
	
	void nestedLoop10() {
		for(int i= 0 ; i<=5 ; i++) {
			for(int j =0; j<= 5; j++) {
					System.out.println("i " + i+ " j " + j);
			}
			break;
		}
	}
}
