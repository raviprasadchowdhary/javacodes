package org.javacodes;

import org.javacodes.helper.Helper;

public class Rough {
    public static void main(String[] args) {
        String input = Helper.readSingleInputString();

        System.out.println("Input string before reversing: " + input);

        System.out.println("Reversed string by StringBuilder: " + reverseStringByStringBuilder(input));
        System.out.println("Reversed string by concatenation: " + reverseStringByConcatenation(input));
        System.out.println("Reversed string by character array: " + reverseStringByCharArray(input));
    }

    // method1: using StringBuilder or StringBuffer
    private static String reverseStringByStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // method2: using string concatenation
    private static String reverseStringByConcatenation(String input) {
        String reversedString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }
        return reversedString;
    }

    // method3: using character array
    private static String reverseStringByCharArray(String input) {
        char[] charArray = input.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}
