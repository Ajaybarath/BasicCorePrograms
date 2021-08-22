package com.bredgeLabz.BasicCorePrograms;

public class LargestNumber {
	
	public static void main(String args[]) {

		int number1 = 55;
		int number2 = 10;
		int number3 = 11;
		
		if (number1 > number2 && number1 > number3) {
			System.out.println("Number 1 is greater");
		}
		else if (number2 > number1 && number2 > number3) {
			System.out.println("Number 2 is greater");
		}
		else {
			System.out.println("Number 3 is greater");
		}
	}

}
