package com.strings;

public class StringPrgrm {
	public static void main(String[] args) {
		
		String s = "abcb";
		//input = "abcb"
		//output = a,ab,abc,abcb,b,bc,bcb,c,cb,b
			for(int i = 0 ; i<= s.length()-1; i++) {
				for(int j = i+1; j<= s.length(); j++) {
					System.out.println(s.substring(i, j));
			}
		}
	}

}
