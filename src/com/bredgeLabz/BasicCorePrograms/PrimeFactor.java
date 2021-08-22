package com.bredgeLabz.BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactor {
	
	public static void main(String args[]){
		
	      int number;
	      
	      Scanner s = new Scanner(System.in);
	      
	      number = s.nextInt();
	     
	      for(int i = 2; i< number; i++) {
	         while(number%i == 0) {
	            System.out.println(i+" ");
	            number = number/i;
	         }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	   }

}
