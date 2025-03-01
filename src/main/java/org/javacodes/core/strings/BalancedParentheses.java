package org.javacodes.core.strings;

import org.javacodes.helper.Helper;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String input = Helper.readSingleInputString();

        if (input == null || input.isEmpty()) {
            System.out.println("Input is empty");
        } else if (balancedParentheses(input)) {
            System.out.println("The expression: " + input + " is balanced");
        } else {
            System.out.println("The expression: " + input + " is not balanced");
        }
    }

    public static boolean balancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((c == ')' && last != '(') || (c == '}' && last != '{') || (c == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
