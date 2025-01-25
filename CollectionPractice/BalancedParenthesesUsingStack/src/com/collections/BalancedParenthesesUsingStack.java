package com.collections;

import java.util.Stack;

public class BalancedParenthesesUsingStack {

	public static void main(String[] args) {

		String input = "{[()]}";

		Stack<Character> stack = new Stack<>();

		char ch[] = input.toCharArray();
		boolean notBlancedParentheses = true;
		for (char c : ch) {

			if (c == '{' || c == '[' || c == '(') {

				stack.push(c);

			} else if (c == '}' || c == ']' || c == ')') {

				if (stack.isEmpty() || !isEqual(stack.pop(), c)) {
					notBlancedParentheses = false;
					break;
				}
			}

		}

		System.out.println(notBlancedParentheses ? "Balanced" : "Not Balanced");

	}

	private static boolean isEqual(Character peek, char c) {

		return peek == '(' && c == ')' || peek == '{' && c == '}' || peek == '[' && c == ']';

	}

}
