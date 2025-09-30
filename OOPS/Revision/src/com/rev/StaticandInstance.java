package com.rev;

public class StaticandInstance {
	
	public static void main(String[] args) {
		int a =1;
		int b =2;
		StaticandInstance s = new StaticandInstance();
		int sum = s.sum(1, 2);
		System.out.println(sum);
		StaticandInstance s3 = new StaticandInstance(1,2);
		int sum2 = sum(1, 2,3);
		System.out.println(sum2);
		
		String s1 = "Navya";
		String s2 = "Navyasri";
		String s4 = "Navya";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		
		StringBuffer sb = new StringBuffer("Navya");
		StringBuffer sb1 = new StringBuffer("Navya");
		StringBuffer sb4 = new StringBuffer("NavyaSri");
		
		StringBuffer sbf = new StringBuffer();
		System.out.println(sb ==sb1);
		System.out.println(sb.equals(sb1));
		
		System.out.println(sb ==sb4);
		System.out.println(sb.equals(sb4));
		
		StringBuilder sb2 = new StringBuilder("Navya");
		StringBuilder sb3 = new StringBuilder("Navya");
		StringBuilder sb5 = new StringBuilder("NavyaSri");
		System.out.println(sb2 ==sb3);
		System.out.println(sb2.equals(sb3));
		
		System.out.println(sb2 ==sb5);
		System.out.println(sb2.equals(sb5));
	}
	
	public int sum(int a , int b) {
		int sum = a+b;
		return sum;
	}
	
	public static int sum(int a, int b, int c) {
		int sum = a+b+c;
		return sum;
	}
	
	public StaticandInstance() {
		System.out.println("parent main constuctor");
	}
	
	public StaticandInstance(int a, int b) {
		System.out.println( a+b+" parent fields constructor");
	}

}
