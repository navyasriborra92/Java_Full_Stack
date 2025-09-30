package com.dsa;

import java.lang.reflect.Array;

public class TwoNumbers_3289 {
	
    public int[] getSneakyNumbers(int[] nums) {
    	int[] num = new int[2];
    	int index =0;
    	for(int i=0; i<=nums.length; i++) {
    		for(int j =i+1; j<nums.length; j++) {
    			if(nums[i]==nums[j]) {
    					num[index] = nums[i];
    					index++;    				}
    		}
    	}    	
		return num;
        
    }
    
    public static void main(String[] args) {
    	TwoNumbers_3289 t = new TwoNumbers_3289();
    	int[] numbers = {0,3,2,1,3,2};
    	int[] arr = t.getSneakyNumbers(numbers);
    	for(int num: arr) {
    		System.out.println(num);
    	}
    	
    	System.out.println(t.addTwoNumbers(10, -15));
	}
    
    public int addTwoNumbers(int a, int b) {
    	int sum = a+b;
    	return sum;
    }

}
