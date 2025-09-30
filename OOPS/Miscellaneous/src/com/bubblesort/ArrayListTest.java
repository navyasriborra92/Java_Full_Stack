package com.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2,4,1,342,43,13,4,1));
		System.out.println(list);
		
		//sort
		for(int i = 0; i<list.size()-1; i++) {
			for(int j =0; j<list.size()-i-1 ; j++) {
				if(list.get(j) > list.get(j+1)){
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
		}
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
	
	private static void extract() {
		

		
	}

}
