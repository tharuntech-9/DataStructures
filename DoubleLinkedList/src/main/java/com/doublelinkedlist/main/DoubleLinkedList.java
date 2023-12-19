package com.doublelinkedlist.main;

import com.doublelinkedlist.node.DoubleNode;

public class DoubleLinkedList {

	DoubleNode head;
	DoubleNode tail;
	int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public DoubleNode createDLL(int nodevalue) {
		head = new DoubleNode();
		DoubleNode node = new DoubleNode();
		node.setValue(nodevalue);
		node.setPrev(null);
		node.setNext(null);
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void insertInDLL(int nodeValue, int location) {
		DoubleNode node = new DoubleNode();
		node.setValue(nodeValue);
		if (!existsDLL()) {
			System.out.println("DLL doesn't exists");
		} else if (location == 0) {
			node.setNext(head);
			node.setPrev(null);
			head.setPrev(node);
			head = node;
		} else if (location >= size) {
			node.setNext(null);
			node.setPrev(tail);
			tail.setNext(node);
			tail = node;
		} else {
			DoubleNode tempnode = head;
			int index = 0;
			while (index < location - 1) {
				tempnode = tempnode.getNext();
				index++;
			}
			node.setPrev(tempnode);
			node.setNext(tempnode.getNext());
			tempnode.setNext(node);
			node.getNext().setPrev(node);
		}
		size++;

	}

	public boolean existsDLL() {
		return head != null;
	}

	public void traverseDLL() {
		if (existsDLL()) {
			DoubleNode tempnode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempnode.getValue());
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempnode = tempnode.getNext();
			}
		} else {
			System.out.println("DLL doesn't exist");
		}
		System.out.println("\n");
	}

	public void deleteDLL() {
		System.out.println("\n\nDeleting Linked List");
		DoubleNode tempNode = head;
		for (int i = 0; i < size; i++) {
			tempNode.setPrev(null);
			tempNode = tempNode.getNext();
		}

		head = null;
		tail = null;
		System.out.println("DLL deleted Successfully");

	}

	public boolean searchNode(int nodeValue) {
		if (existsDLL()) {
			DoubleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at locaiton: " + i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! ");
		return false;
	}

}
