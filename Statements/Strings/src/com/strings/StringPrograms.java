package com.strings;

public class StringPrograms {
	public static void main(String[] args) {
		StringPrograms sp = new StringPrograms();
		sp.reverseString("Hyderabad");
		sp.reverseString("MADAM");
		sp.reverseString("racecar");
		
	}
	
	void reverseString(String s) {
		
		String result= "";
		for(int i = s.length()-1; i >= 0; i--) {
			char temp = s.charAt(i);
			result += temp;
		}
		System.out.println(result);
		
	}

}
