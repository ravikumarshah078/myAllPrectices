package stack;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack();
		stack.push(12);
		stack.push(23);
		stack.push(25);
		stack.push(45);
		stack.push(34);
		
		int peeked=stack.peek();
		int popped=stack.pop();
		
		System.out.println("deleted element of stack: "+popped);
		System.out.println("Top element of stack: "+peeked);
		System.out.println("remaining elements of stack: "+stack);
		System.out.println(stack.empty());
	}

}
