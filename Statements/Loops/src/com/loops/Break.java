package com.loops;

public class Break {
	public static void main(String[] args) {
		for(int i = 1; i<=10;i++) {
			System.out.println(i);
			break;
		}
		for (int i= 1; i<= 10; i++) {
			System.out.println(i);
			if (i ==7) {
				break;
			}
		}
		for (int i= 14; i <=20; i++) {
			if(i ==19) {
				break;
			}
			System.out.println(i);
		}
	}

}
