package com.operators;

public class TernaryOperatorsTask {
	public static void main(String[] args) {
		int marks = 99;
		String result = (marks > 90 && marks <100) ? "Grade A" : (marks <= 90 && marks >70) ? 
				"Grade B" : (marks <= 70 && marks >50) 
				? "Grade C" : (marks <= 50 && marks >0) ? "Fail" : "Invalid";
			System.out.println(result);
	}

}