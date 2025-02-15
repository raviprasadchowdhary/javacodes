package org.javacodes.core.strings;

import org.javacodes.helper.Helper;

public class ReverseString {
	public static void main(String[] args){
		String input = Helper.readSingleInputString();

		System.out.println("Input string before reversing: " + input);

		System.out.println("Method 1: " + reverseString1(input));
		System.out.println("Method 2: " + reverseString2(input));
		System.out.println("Method 3: " + reverseString3(input));

	}

	// Method 1: Using StringBuilder/StringBuffer
	public static String reverseString1(String input) {
		return new StringBuilder(input).reverse().toString();
	}

	// Method 2: Using character array
	public static String reverseString2(String input) {
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length - 1;

		while (left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}

		return new String(charArray);
	}

	// Method 3: Using concatenation
	public static String reverseString3(String input) {
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		return reversed;
	}
}
