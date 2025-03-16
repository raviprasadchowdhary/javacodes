package org.javacodes.core.controlstatements;

import org.javacodes.helper.Helper;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = Helper.readSingleInputInteger();

		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(input + " is prime");
		} else {
			System.out.println(input + " is not prime");
		}
	}
}
