package stack;

import java.util.Stack;

public class StringReverser {
	public String reverse(String input) {
		Stack<Character> stack = new Stack<>();
		
//		1st way to ittrate ovwe the string
//		for(int i=0; i<input.length(); i++) {
//			stack.push(input.charAt(i));
//		}
//		or with the foreach loop
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		/**
		 * this method takes the memory more...
		 * that is why we are using here stringBuffer ...
		 */
//		String reversed = "";
//		while(!stack.empty()) {
//			reversed += stack.pop();
//		}
//		return reversed;
		
		StringBuffer reversed = new StringBuffer();
		while(!stack.empty()) {
			reversed.append(stack.pop());
		}
		return reversed.toString();
	}

}
