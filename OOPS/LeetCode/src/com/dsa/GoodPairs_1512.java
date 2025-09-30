package com.dsa;

public class GoodPairs_1512 {

    public int numIdenticalPairs(int[] nums) {
    	int count = 0;
    	for(int i =0 ; i<=nums.length; i++) {
    		for(int j = i+1; j<nums.length; j++) {
    			if((nums[i]== nums[j]))
    			{
    				count++;
    			}
    		}
    	}
		return count;
        
    }
    
    public static void main(String[] args) {
    	GoodPairs_1512 g = new GoodPairs_1512();
    	int[] numbers = new int[6];
    	numbers[0] = 1;
    	numbers[1] = 2;
    	numbers[2] = 3;
    	numbers[3] = 1;
    	numbers[4] = 1;
    	numbers[5] = 3;
    	System.out.println(g.numIdenticalPairs(numbers));
	}
}
