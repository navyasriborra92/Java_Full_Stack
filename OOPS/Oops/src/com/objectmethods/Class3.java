package com.objectmethods;

import com.accessmodifiers.Class1;

public class Class3  extends Class1{
	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println("from class5 " + obj.a);
		obj.hi();
//		System.out.println(obj.b);//field not visible
//		obj.bye(); not visible private
		
//		obj.c //c not visible --protected
		Class3 obj3 = new Class3();
		System.out.println(obj3.c);  // protected variable c is accessible as this object is child class
//		System.out.println(obj3.d);
		// default variable c is accessible as this object is child class	
		}

}
