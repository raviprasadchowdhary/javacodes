package org.javacodes.core.pattern.stars;

import org.javacodes.helper.Helper;

public class InvertedRightAngledTriangle {
	public static void main(String[] args) {
		int row = Helper.readSingleInputInteger();

		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
