package com.dsa;

import java.util.ArrayList;

public class Divide_2520 {
    public int countDigits(int num) {
    	int original =  num;
    	int count =0;
    	while(num>0) {
    		int digit = num%10;
    		num = num/10;
    		System.out.println(digit);
    		
    		if(digit!=0 && original%digit ==0) {
    			count++;
    				}
    	}   	
		return count;
        
    }
    public static void main(String[] args) {
    	Divide_2520 d = new Divide_2520();
    	int countDigits = d.countDigits(121);
    	System.out.println(countDigits);
    	System.out.println(1248%8);
    	System.out.println(1248%4);
    	System.out.println(121%2);
    	System.out.println(1248%1);
	}
}
