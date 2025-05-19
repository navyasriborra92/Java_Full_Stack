package com.dsa;

public class DistrubuteMoney {
	public static void main(String[] args) {
		int money = 100;
		int children = 20;
		DistrubuteMoney dm =new DistrubuteMoney();
		System.out.println(dm.distMoney(money, children));
		
	}
	
	    public int distMoney(int money, int children) {
	        // Each child must get at least $1
	        money -= children;
	        if (money < 0) return -1;  // Not enough money for even $1 per child

	        int count = Math.min(money / 7, children);  // Try to give $8 to as many as possible

	        money -= count * 7;
	        children -= count;

	        // Handle edge cases
	        if ((children == 0 && money > 0) ||  // Leftover money but no children
	            (children == 1 && money == 3)) { // Would force giving $4
	            count--;
	        }

	        return count;
	    }


}
