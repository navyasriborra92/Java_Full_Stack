package com.dsa;

public class Max_Number_2769 {
	
    public int theMaximumAchievableX(int num, int t) {
    	int x = 0;
    	x = num+2*t;
		return x;
        
    }
    
    public static void main(String[] args) {
    	Max_Number_2769 m = new Max_Number_2769();
    	System.out.println(m.theMaximumAchievableX(4,1));
    	System.out.println(m.theMaximumAchievableX(3,2));
	}

}
