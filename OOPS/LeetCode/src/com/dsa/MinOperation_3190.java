package com.dsa;

public class MinOperation_3190 {

    public int minimumOperations(int[] nums) {
    	int count =0;
    	for(int i =0; i<nums.length;i++) {
    		if(nums[i]%3 !=0) {
    			if((nums[i]+1)%3 ==0) {
    				count++;
    			}
    			else if((nums[i]-1)%3 ==0){
    				count++;
    			}
    		}

    	}
		return count;
        
    }
    
    public static void main(String[] args) {
    	MinOperation_3190 m = new MinOperation_3190();
    	int[] nums = {1,2,3,4};
    	System.out.println(m.minimumOperations(nums));
	}
}
