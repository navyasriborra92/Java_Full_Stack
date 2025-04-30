package com.methods;

public class ImplictCasting {
	
	public static void main(String[] args) {
	byte b = 10;
	short s = b;
	s= 784;
	System.out.println("byte" + b);
	System.out.println("short" + s);
	int i = s;
	i = 723534;
	System.out.println("int "+ i);
	
	long l = i;
	l = 12345657642673L;
	System.out.println("long "+ l);
	
	float f = 34.45F;
	double d = f;
	System.out.println("float "+ f);
	System.out.println("double "+ d);

	}

}
