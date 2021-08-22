package com.bredgeLabz.BasicCorePrograms;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String args[]) {
		int number1;
		int number2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number 1 : ");
		number1 = s.nextInt();
		
		System.out.print("Enter number 2 : ");
		number2 = s.nextInt();
		
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("Number 1 is : " + number1);
		System.out.println("Number 2 is : " + number2);

		
	}

}
