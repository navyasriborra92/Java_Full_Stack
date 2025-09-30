package com.dsa;

public class ArraySum3512 {
	
    public int minOperations(int[] nums, int k) {
    	int add = 0;
    	int count = 0;
    	int index =0;
    	int[] num = nums.clone();
    	for(int i =0; i<num.length; i++) {
    		add += num[i];
    		}
    	System.out.println(add);
    	while((add%k) != 0){
    		for(int i =0; i<num.length; i++) {
        		add += num[i];
        		}
    		if(index < nums.length) {
    			num[index] = num[index] -1;
    			count++;
    			System.out.println(index);
    			System.out.println(num[index]);
    			
    			if(num[index] == 0){
    				index++;
    				count++;
    			}
    		}
    	}
    	
		return count;
        
    }
    
    public static void main(String[] args) {
    	ArraySum3512 a = new ArraySum3512();
    	int[] nums = {1,2,3,4};
    	int minOperations = a.minOperations(nums, 4);
    	System.out.println(minOperations);
	}

}
