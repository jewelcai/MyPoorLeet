package com.leet;

import java.util.*;

public class Problem20 {

	public static boolean isValid(String s) {
		if (s == null || s.length() == 0)
			return true;
		if (s.length() % 2 != 0)
			return false;
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		char scan, match;
		// boolean flag = true;
		while (count < s.length()) {
			scan = s.charAt(count);
			if (scan == '(' || scan == '[' || scan == '{') {
				stack.push(scan);
			} else if (!stack.empty()
					&& (scan == ')' || scan == ']' || scan == '}')) {
				match = stack.pop();

				if (!(scan == ')' && match == '(' || scan == ']'
						&& match == '[' || scan == '}' && match == '{')) {
					return false;
				}
			}
			count++;
		}
		return stack.empty();
	}

	public static void main(String[] args) {
		String s = ")}{({))[{{[}";
		boolean b = isValid(s);
		System.out.println(b);
	}
}
