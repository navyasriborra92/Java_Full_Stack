package com.dsa;

public class XOR_1486 {
	    public static int xorOperation(int n, int start) {
	        int xor = 0;
	        for (int i = 0; i < n; i++) {
	            xor ^= (start + 2 * i);
	        }
	        return xor;
	    }

	    public static void main(String[] args) {
	        int n = 4;
	        int start = 3;
	        int result = xorOperation(n, start);
	        System.out.println("Result: " + result);  // Output: 14
	    }

}
