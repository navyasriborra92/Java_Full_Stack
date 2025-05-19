package com.dsa;

public class Anagram {
	public static void main(String[] args) {
		String s = "hgfgtnbg";
		String t = "ghfgtnbg";
		Anagram a = new Anagram();
		boolean isAnagram = a.isAnagram(s, t);
		if(isAnagram) {
			System.out.println("Is Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
	}
	
	boolean isAnagram(String s , String t) {
		if(s.length() != t.length()) return false;
			 int[] count = new int[26];
			 
			 for(int i =0; i<s.length();i++) {
				 count[s.charAt(i) - 'a']++;
				 count[t.charAt(i) - 'a']--;
			 }
			 for(int value:count) {
				 if(value!=0) return false;
			 }
			 return true;
	}

}
