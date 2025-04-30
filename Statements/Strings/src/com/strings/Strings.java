package com.strings;

public class Strings {
	public static void main(String[] args) {
		String s1 = "FLM";
		String s2 = "FLM";
		System.out.println(s1 ==s2);
		
		String s3 = new String("EduTech");
		String s4 = new String("EduTech");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		/* Strings non primitive, immutable
		 * Literals String s = "hcvgjh
		 * String s = new String("hgygy")
		 * Literals String constant pool
		 * Multiple string wit same value -> all will refer to same value
		 * String s1 = "FLM";
		 * String s2 = "flm";
		 * s2 = "FM";*/
			String s11 = "FLM";
			String s12 = "flm";
			s2 = "FM";
			
			/* Object -> Heap
			 * String st = new String("FLM");
			 * String st2 = new String("FLM");*/
			
			String st = new String("FLM");
			String st2 = new String("FLM");

	}

}
