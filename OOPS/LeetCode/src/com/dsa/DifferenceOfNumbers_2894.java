package com.dsa;

public class DifferenceOfNumbers_2894 {

    public int differenceOfSums(int n, int m) {
    	int result = 0;
    	int num1 = 0;
    	int num2 = 0;
    	for(int i =1; i<=n ; i++) {
    		if(i%m !=0) {
    			num1 +=i;
    		}
    		if(i%m == 0) {
    			num2 += i;
    		}
    		result = num1-num2;
    	}
        
		return result;
    }
    
    public static void main(String[] args) {
    	DifferenceOfNumbers_2894 d = new DifferenceOfNumbers_2894();
    	System.out.println(d.differenceOfSums(10,3));
    	System.out.println(d.differenceOfSums(5,6));
    	System.out.println(d.differenceOfSums(5,1));
	}
}
