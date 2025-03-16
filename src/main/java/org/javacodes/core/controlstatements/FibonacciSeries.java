package org.javacodes.core.controlstatements;

import org.javacodes.helper.Helper;

public class FibonacciSeries {
	public static void main(String[] args) {
		int input = Helper.readSingleInputInteger();

		System.out.print("Fibonacci series: ");
		int first = 0, second = 1, next = 0;
		for (int i = 0; i <= input; i++) {
			System.out.print(first);
			next = second + first;
			first = second;
			second = next;
			if (i + 1 <= input) {
				System.out.print(", ");
			}
		}
	}
}
