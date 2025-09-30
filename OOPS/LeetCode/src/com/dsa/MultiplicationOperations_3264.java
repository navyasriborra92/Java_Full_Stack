package com.dsa;

import java.util.Arrays;

public class MultiplicationOperations_3264 {
	public int[] getFinalState(int[] nums, int k, int multiplier) {

		int[] updated_nums = nums.clone();
		
		for(int j=1; j<=k; j++) {
			int min_number =updated_nums[0];
			int min_index =0;
			for(int i=1; i<updated_nums.length; i++) {
				if(updated_nums[i] < min_number ){
					min_number = updated_nums[i];
					min_index =i;
				}
			}
			updated_nums[min_index] =min_number * multiplier;
		}
		return updated_nums;

	}

	public static void main(String[] args) {
		MultiplicationOperations_3264 m = new MultiplicationOperations_3264();
		int[] nums = {7,3,4,4,5,8};
		int[] result =m.getFinalState(nums, 5, 2);
		System.out.println(Arrays.toString(result));
	}

}
