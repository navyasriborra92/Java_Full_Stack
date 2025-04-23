package com.statements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of the week : ");
		int day = sc.nextInt() ;
		
//		String dayofweek = day ==1 ? "Monday" : 
//			day ==2 ? "Tuesday" : 
//				day ==3 ? "Wednesday" :
//					day ==4 ?"thursday" :
//						day ==5 ? "Friday" : 
//							day ==6 ? "Saturday" :
//								((day <= 0) || (day>7))  ? "Invalid" : "Sunday";
//	System.out.println(dayofweek);
	
	switch(day){
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Invalid");
	}
			
	sc.close();
	}
}
