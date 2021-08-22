package com.bredgeLabz.BasicCorePrograms;

import java.util.Scanner;

public class HormonicNumber {
	
	public static void main(String args[]) {
		
		int hormonicValue = 0;
		Scanner s = new Scanner(System.in);
		
		hormonicValue = s.nextInt();
		
		float hormonicNumber = 1;
		
		for (int i=1;i<hormonicValue;i++) {
			
			hormonicNumber = hormonicNumber + (1/i);
			
		}
		
		System.out.println("The hormonic value is " + hormonicNumber);
	}

}
