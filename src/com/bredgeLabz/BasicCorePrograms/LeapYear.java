package com.bredgeLabz.BasicCorePrograms;

public class LeapYear {
	
	public static void main(String args[]) {
		
		int year = 2000;
		boolean isLeapYear = false;
		
		if (year % 4 == 0) {
			isLeapYear = true;
			if (year % 100 == 0 && year % 400 != 0) {
				isLeapYear = false;
			}
		}
		
		System.out.println(year + " is a leap year : " + isLeapYear);
	}

}
