package com.bredgeLabz.BasicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String args[]) {
		int powerValue = 0;
		
		Scanner s = new Scanner(System.in);
		
		powerValue = s.nextInt();
		
		for (int i=0;i<+powerValue;i++) {
			int powerOfTwo = (int) Math.pow(2, i);
			
			boolean isLeapYear = false;
			
			if (powerOfTwo % 4 == 0) {
				isLeapYear = true;
				if (powerOfTwo % 100 == 0 && powerOfTwo % 400 != 0) {
					isLeapYear = false;
				}
			}
			
			System.out.println(powerOfTwo + " is a leap year : " + isLeapYear);
		}
		
		
						
	}

}
