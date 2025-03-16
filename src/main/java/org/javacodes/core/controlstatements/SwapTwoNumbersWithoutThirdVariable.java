package org.javacodes.core.controlstatements;

import org.javacodes.helper.Helper;

public class SwapTwoNumbersWithoutThirdVariable {
	public static void main(String[] args) {
		int a = Helper.readSingleInputInteger("Enter first number: ");
		int b = Helper.readSingleInputInteger("Enter second number: ");

		System.out.println("Before swapping:");
		System.out.println("First number: " + a + "; " + "Second number: " + b);

		a=a+b; // 2+3
		b=a-b; // 5-3
		a=a-b; // 5-2

		System.out.println("After swapping:");
		System.out.println("First number: " + a + "; " + "Second number: " + b);
	}
}
