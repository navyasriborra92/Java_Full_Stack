package com.dsa;

public class ProductSum_1281 {
    public int subtractProductAndSum(int n) {
    	int digit = 0;
    	int sum = 0;
    	int product = 1;
    	while(n >0) {
    	digit = n%10;
    		n = n/10;
    		sum +=digit;
    		product *=digit;
    	}
    	int result = product - sum;
		return result;        
    }
    
    public static void main(String[] args) {
    	ProductSum_1281 p = new ProductSum_1281();
    	int subtractProductAndSum = p.subtractProductAndSum(2345);
    	System.out.println(subtractProductAndSum);
	}
}
