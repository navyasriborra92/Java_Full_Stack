package com.accessmodifiers;

public class Class2 {
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
	System.out.println("from class2" + obj.a);
	obj.hi();
//	System.out.println(obj.b);  field not visible as it is private
//	obj.bye();  not visible private method
	}

}
