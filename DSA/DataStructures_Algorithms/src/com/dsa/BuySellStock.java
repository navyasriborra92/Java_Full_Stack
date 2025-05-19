package com.dsa;

public class BuySellStock {
	public static void main(String[] args) {
		int[] stockPrice = new int[4];
		stockPrice[0] = 7;
		stockPrice[1] = 1;
		stockPrice[2] = 4;
		stockPrice[3] = 9;
		BuySellStock bs = new BuySellStock();
		int profit = bs.buySell(stockPrice);
	}
	int buySell(int[] prices) {
		int minvalue = Integer.MIN_VALUE;
		int maxvalue = Integer.MAX_VALUE;
		for(int i = 0; i< prices.length ; i++) {
				if(prices[i] < minvalue) {
				}
			}
		return maxvalue;
	}

}
