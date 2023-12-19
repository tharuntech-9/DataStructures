package com.stack.list;

public class StackByListMain {
	public static void main(String[] args) {
		StackByList stack = new StackByList();

		System.out.println("Pushing 10 values into stack");
		for (int i = 1; i <= 10; i++) {
			stack.push(i * 10);
		}
		System.out.println();

		System.out.println("Peeking value");
		System.out.println(stack.peek());
		System.out.println();

		System.out.println("Poping 11 values from stack");
		for (int i = 1; i <= 11; i++) {
			System.out.println(stack.pop());
		}
		System.out.println();

	}
}
