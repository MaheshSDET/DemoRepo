package TestPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {

		char[] s = "()[]}".toCharArray();

		Map<Character, Character> hm = new HashMap<Character, Character>();

		hm.put('}', '{');
		hm.put(']', '[');
		hm.put(')', '(');

		Stack<Character> stack = new Stack<Character>();

		for (char ch : s) {

			if (!hm.containsKey(ch)) {

				stack.push(ch);

			} else {
				if (stack.isEmpty()) {
					System.out.println(false);
				} else if (stack.peek() == hm.get(ch)) {
					stack.pop();
				} else {
					System.out.println(false);
				}

			}

		}
		System.out.println(stack.isEmpty());

	}

}

