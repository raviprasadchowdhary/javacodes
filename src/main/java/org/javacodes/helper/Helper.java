package org.javacodes.helper;

import java.util.Scanner;

public class Helper {

	public static String readSingleInputString(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = scanner.nextLine();
		return input;
	}

	public static int readSingleInputInteger(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int input = scanner.nextInt();
		return input;
	}

	public static int readSingleInputInteger(String inputString){
		Scanner scanner = new Scanner(System.in);
		System.out.println(inputString);
		int input = scanner.nextInt();
		return input;
	}
}
