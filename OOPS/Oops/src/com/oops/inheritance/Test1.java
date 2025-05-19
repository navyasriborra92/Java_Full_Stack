package com.oops.inheritance;

public class Test1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.m1();
		Child c = new Child();
		c.m2();
		System.out.println(c.a);
	}

}
