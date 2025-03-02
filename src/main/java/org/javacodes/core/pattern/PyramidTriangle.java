package org.javacodes.core.pattern;

import org.javacodes.helper.Helper;

public class PyramidTriangle {
	public static void main(String[] args) {
		int row = Helper.readSingleInputInteger();

		System.out.println("Below is the Pyramid triangle with " + row + " rows");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < (row - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (1 + (i * 2)); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
