package org.javacodes.core.controlstatements;

import org.javacodes.helper.Helper;

public class OddOrEven {
	public static void main(String[] args) {
		int input = Helper.readSingleInputInteger();
		if (input % 2 == 0) {
			System.out.println(input + " is even");
		} else {
			System.out.println(input + " is odd");
		}
	}
}
