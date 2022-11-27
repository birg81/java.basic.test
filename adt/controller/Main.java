package controller;

import model.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("lunedì");
		stack.push("martedì");
		stack.push("mercoledì");
		stack.push("giovedì");
		stack.push("venerdì");
		stack.push("sabato");
		stack.push("domenica");
		while(!stack.isEmpty()) {
			System.out.println(stack);
			System.out.printf("%s (%d remains)\n", stack.pop(), stack.size());
		}
	}
}