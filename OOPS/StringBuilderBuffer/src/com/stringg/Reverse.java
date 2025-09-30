package com.stringg;

public class Reverse {
	public static void main(String[] args) {
		String s = "java";
		String rev = "";
		for(int i = s.length()-1; i>=0; i--) {
			rev+=s.charAt(i);
		}
		System.out.println(rev);
	
	StringBuffer s1 = new StringBuffer("Java Programming");
	StringBuffer rev1 = s1.reverse();
	System.out.println(rev1);
	}

}
