package com.dsa;

import java.util.Arrays;

public class DatetoBinary_3280 {
	
    public String convertDateToBinary(String date) {
    	String[] dates = date.split("-");
    	System.out.println(Arrays.toString(dates));
    	
    	int year = Integer.parseInt(dates[0]);
    	int month = Integer.parseInt(dates[1]);
    	int day = Integer.parseInt(dates[2]);
    	
    	String yearBin = Integer.toBinaryString(year);
    	String monthBin = Integer.toBinaryString(month);
    	String DayBin = Integer.toBinaryString(day);
    	
    	String bindate = yearBin + "-"+ monthBin + "-" + yearBin;
		return bindate;
        
    }
    
    public static void main(String[] args) {
    	DatetoBinary_3280 d = new DatetoBinary_3280();
    	System.out.println(d.convertDateToBinary("2024-06-02"));
	}

}
