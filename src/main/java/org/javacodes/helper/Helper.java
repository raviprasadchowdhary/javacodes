package org.javacodes.helper;

import java.util.Scanner;

public class Helper {

	public static String readSingleInputString(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		return input;
	}

}
