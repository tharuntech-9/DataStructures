package com.stack.list;

import com.SingleLinkedList.main.SingleLinkedList;

public class StackByList {

	SingleLinkedList list;

	public StackByList() {
		list = new SingleLinkedList();
	}

	public void push(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {
			list.insertInLinkedList(value, 0);
		}
		System.out.println("Inserted " + value + " in Stack ");
	}

	public int pop() {
		int value = -1;
		if (isEmpty()) {
			System.out.println("Error");
		} else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}

	public boolean isEmpty() {
		if (list.getHead() == null) {
			return true;
		} else {
			return false;
		}
	}

	public int peek() {

		if (!isEmpty()) {
			int value = list.getHead().getValue();
			return value;
		} else {
			System.out.println("The Stack is Empty");
			return -1;

		}

	}

	public void deleteStack() {
		list.setHead(null);
	}
}
