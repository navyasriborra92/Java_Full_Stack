package com.dsa;

public class Matches_1688 {
    public int numberOfMatches(int n) {
    	
    	int add = 0;
    	while(n>=0) {
    		int count = n/2;
    		if (count == 0) break;
    		n -=count;
    		add+=count;
    	}
		return add;
        
    }
    public static void main(String[] args) {
    	Matches_1688 m = new Matches_1688();
    	int numberOfMatches = m.numberOfMatches(7);
    	System.out.println(numberOfMatches);
	}
}
