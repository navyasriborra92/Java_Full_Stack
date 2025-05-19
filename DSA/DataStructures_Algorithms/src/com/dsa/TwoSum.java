package com.dsa;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int target = 9;
		arr[0] = 3;
		arr[1] = 7;
		arr[2] = 2;
		arr[3] = 4;
		arr[4] = 6;
		TwoSum ts= new TwoSum();
		int[] nums =ts.twoSum(arr, target);
		if(nums.length ==2) {
		System.out.println("indices :" + "["+nums[0]+"],"+ "["+nums[1]+"]");
		}
		else
		{
			System.out.println("No two indices found");
		}
	}
	
	int[] twoSum(int[] arr, int target){		
		for(int i =0; i<arr.length; i++) {
			for(int j = 1 ; j< arr.length-1; j++) {
			if(target == arr[i]  + arr[j]) {
				return new int[]{i,j};
				}
			}
		}
		return new int[]{};
	}

}
