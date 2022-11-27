package controller;

import model.Stack;

public class Main {
	public static void main(String[] args) {
		// Create a new Stack of String
		Stack<String> stack = new Stack<>();
		// print a void stack
		System.out.println(stack);
		// popolate stack with many elements
		stack.push("monday");
		stack.push("tuesday");
		stack.push("wednesday");
		stack.push("thursday");
		stack.push("friday");
		// Remember: the buffer size have a limit of 5 elements!
		stack.push("saturday");
		stack.push("sunday");
		// progressive removing elements while stack will be empty
		while(!stack.isEmpty()) {
			System.out.println(stack);
			System.out.printf("%s (%d remains)\n", stack.pop(), stack.size());
		}
		// now stack is empty
		System.out.println(stack);
		System.out.printf("%s (%d remains)\n", stack.pop(), stack.size());
	}
}
