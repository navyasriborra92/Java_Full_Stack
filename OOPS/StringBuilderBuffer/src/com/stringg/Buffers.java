package com.stringg;

public class Buffers {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello world");
		s.append(" Java");
		s.insert(5, ",");
		s.replace(7, 12, "flm");
		s.delete(5, 6);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		
		StringBuilder s1 = new StringBuilder("Hello World");
		System.out.println(s1.capacity());
		
		s1.append(" Java");
		s1.insert(5, ",");
		s1.replace(7, 12, "flm");
		s1.delete(5, 6);
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		String a = s.toString();
	}

}
