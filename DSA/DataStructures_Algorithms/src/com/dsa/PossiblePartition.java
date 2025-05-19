package com.dsa;

public class PossiblePartition {
	public static void main(String[] args) {
		PossiblePartition pp = new PossiblePartition();
		int[] arr = {1,2,3,1,3,12,3,4,2,3,2,3,3,2};
		boolean isPoss = pp.isParttitionPosible(arr);
		System.out.println(isPoss);
		
	}
	
	
	boolean isParttitionPosible(int[] arr) {
		
		if (arr.length <1) return false;
		int count = 0;
		if(arr.length>=2) {
			for(int i =0; i<arr.length; i++) {
				
			}
		}
		return false;
		
	}

}
