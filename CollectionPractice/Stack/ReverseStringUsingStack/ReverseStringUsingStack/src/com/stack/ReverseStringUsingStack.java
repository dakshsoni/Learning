package com.stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {

		String data = "RanaR";

		Stack<String> stack = new Stack<>();

		String s[] = data.split("");

		for (String trav : s) {

			stack.add(trav);

		}

		String res = "";
		
		while (!stack.isEmpty()) {
			
			res += stack.pop();
		}
		
		System.out.println(res.equals(data));
		

	}

}
