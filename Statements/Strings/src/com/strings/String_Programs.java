package com.strings;

public class String_Programs {
	public static void main(String[] args) {
		String_Programs sp = new String_Programs();
		sp.vowelsAndConsonants();
		sp.countOccurrennce();
		
	}
	
	void vowelsAndConsonants() {
		String st = "Apple";
		String s = st.toLowerCase();
		int vowelcount = 0;
		int ConCount = 0;
		for(int i = 0; i<= s.length()-1; i++) {
			char ch = s.charAt(i);
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch) != -1) {
					vowelcount++;
				}
				else {
					ConCount++;
				}
			}
			
		}
		System.out.println("Vowel count "+ vowelcount + " ConCount "+ ConCount);
	}
	
	 void duplicate_Characters() {
		 String st = "programming";
		 String s = st.toLowerCase();
		 for(int i = 0; i< s.length(); i++) {
			
		 }
		 
	 }
	 
	 void countOccurrennce() {
		 String st = "Apple";
		 String s= st.toLowerCase();
		 int count = 0;
		 for(int i = 0; i< s.length(); i++) {
			 char ch = s.charAt(i);
			 for(int j = i; j< s.length(); j++) {
				 if(ch == s.charAt(j)) {
				 count++;
				 }
			 }
			 System.out.println(ch +":"+ count);
		 }
	 }

}
