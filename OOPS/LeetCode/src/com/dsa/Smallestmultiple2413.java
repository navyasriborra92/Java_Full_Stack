package com.dsa;

public class Smallestmultiple2413 {

    public int smallestEvenMultiple(int n) {
    	int a =0;
    	if(n%2 ==0) {
    		return n;
    	}
    	else {
    		return 2*n;
    	}       
    }
    
    public static void main(String[] args) {
    	Smallestmultiple2413 s = new Smallestmultiple2413();
    	System.out.println(s.smallestEvenMultiple(5));
    	
	}
}
