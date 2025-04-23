package com.loops;

public class LoopsTask {
	public static void main(String[] args) {
		String company = "FRONTLINES";
		int len = company.length();
		for(int i = 0; i<len; i++) {
			System.out.println(company.charAt(i));
		}
		
		for(int i = 1; i<= 5;i++) {
			for(int j =5; j>=i ; j-- ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
