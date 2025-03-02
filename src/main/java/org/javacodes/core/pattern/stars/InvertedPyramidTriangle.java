package org.javacodes.core.pattern.stars;

import org.javacodes.helper.Helper;

public class InvertedPyramidTriangle {
	public static void main(String[] args) {
		int row = Helper.readSingleInputInteger();

		System.out.println("Below is the inverted pyramid triangle with " + row + " rows");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = ((row - i - 1) * 2) + 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
