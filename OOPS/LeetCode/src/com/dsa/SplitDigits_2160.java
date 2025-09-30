package com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitDigits_2160 {
    public int minimumSum(int num) {
    	ArrayList<Integer> digits = new ArrayList();
    	while(num>0){
    		int digit = num%10;
    		num = num/10;
    		digits.add(digit);
    	}
    	System.out.println(digits);
		return num;
        
    }

    public static void main(String[] args) {
    	SplitDigits_2160 s = new SplitDigits_2160();
    	System.out.println(s.minimumSum(2345));
	}
}
