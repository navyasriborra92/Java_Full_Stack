package com.dsa;

public class ReverseArray {
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int[] arr = {1,4,6,8,43,7,9,4,9};
		int[] newarr = ra.reverseArray(arr);
		//enhanced for loop/for each loop
		for(int a : newarr) {
			System.out.println(a);
		}
		int[] newarr2 = ra.reverseArray1(arr);
		for(int a : newarr2) {
			System.out.println(a);
		}
	}
	
	int[] reverseArray(int[] arr) {
		int[] revarr =new int[arr.length];
		int j=0;
		for(int i=arr.length-1 ; i>=0;i--) {
		revarr[j] = arr[i];
		j++;
		}
		return revarr;
	}
	
	int[] reverseArray1(int[] arr) {
		int i=0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
		
	}

}
