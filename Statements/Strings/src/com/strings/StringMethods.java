package com.strings;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		String s = "FLMEdutech";
		String s1 = "FLMEdutech";
		
		String st  = new String("FLM");
		String st2 = new String("FLM");
		
		// == compares memory addresses .equals compares content
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		System.out.println(st == st2);
		System.out.println(st.equals(st2));
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter the string : ");
		//String str = sc.nextLine();
		String str = "FLM Eductech";
		StringMethods sm = new StringMethods();
		
		sm.findLength(str);
		int len = sm.findLength1(str);
		System.out.println(len);
		//System.out.println("enter the index : ");
		int index = 2;
		//int index = sc.nextInt();
		sm.printCharAtIndex(str, index);
		sm.checkIfEmpty("");
		sm.checkIfEmpty(" ");
		sm.checkIfBlank(" ");
		sm.checkIfBlank("    A");
		sm.checkIfEqualsIgnoreCase("FLM");
		String a = "FLM";
		String b = "FLM edutech";
		System.out.println("Contains : "+ b.contains(a));
		System.out.println("Strats with "+b.startsWith(a));
		System.out.println("Ends with "+b.endsWith("Edutech"));
		System.out.println(b.indexOf("L"));
		System.out.println(b.indexOf("e"));
		System.out.println(b.lastIndexOf("e"));
		
		//substring
		//Programming -> index 0-10 to take out only Pro 
		//starting index and ending index +1
		String s3 = "Programming";
		System.out.println(s3.substring(0, 3));
		System.out.println(s3.substring(7, 11));
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(7));
		System.out.println(s3.substring(10));
		
		String s4 = "Hi    ";
		System.out.println(s4.length());
		System.out.println(s4.trim().length());
		System.out.println(s4.length());
		s4 = s4.trim();
		System.out.println(s4.length());
		
		String s5 = "  hi   ";
		System.out.println(s5.length());
		System.out.println(s5.trim().length());
		
		String s6 = "   HI  FLM  ";
		System.out.println(s6.length());
		System.out.println(s6.trim().length());
		
		String s7 = "FLM Hyderabad";
		System.out.println(s7.replace('H', 'S'));
		System.out.println(s7.replace('a', 'e'));
		System.out.println(s7.replace("Hyderabad", "Bangalore"));
		System.out.println(s7.replace("hyderabad", "Chennai"));
		
		String s8 = "abcaabcaa";
		System.out.println(s8.replace("aa", "bb"));
		System.out.println(s8.replaceFirst("aa", "bb"));
		System.out.println(s8.toUpperCase());
		System.out.println(s7.toLowerCase());
		
	}

	void findLength(String s) {
		
		System.out.println(s.length());
				
	}
	
	int findLength1(String s) {
		int l = s.length();
		return l;
	}
	
	void printCharAtIndex(String s, int index) {
		//0123456789
		//FLMEductech
		System.out.println(s.charAt(index));
	}
	
	void checkIfEmpty(String s) {
		//String s = " " it will consider spaces
		System.out.println(s.isEmpty());
		
	}
	void checkIfBlank(String s) {
		//blank will not consider spaces
		System.out.println(s.isBlank());
	}
	void checkIfEqualsIgnoreCase(String s) {
		System.out.println(s.equalsIgnoreCase("flm"));
	}

}
