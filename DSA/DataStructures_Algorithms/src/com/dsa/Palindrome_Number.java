package com.dsa;

public class Palindrome_Number {
	public static void main(String[] args) {

		Palindrome_Number pn = new Palindrome_Number();
		System.out.println(pn.isPalindrome(121));
	}

	boolean isPalindrome(int x) {
		int reversed = 0;
		int original = x;
		if(x<0 ||(x%10== 0 && x!= 0 )) return false;
		while(x>0) {
			int digit = x% 10;
			reversed = reversed* 10 + digit;
			x/=10;
		}
		return original == reversed;
	}
}
