package com.bredgeLabz.BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String args[]) {

		int numberOfHeads = 0;
		int numberOfFlips = 0;

		Scanner s = new Scanner(System.in);
		numberOfFlips = s.nextInt();

		for (int i = 0; i < numberOfFlips; i++) {
			double coin = (double) Math.random();

			if (coin > 0.5) {
				numberOfHeads++;
			}
		}

		int headPercentage = ((numberOfHeads * 100) / numberOfFlips);
		int tailPercentage = 100 - headPercentage;

		System.out.println("Head percentage is " + headPercentage);

		System.out.println("Tail percentage is " + tailPercentage);

	}

}
