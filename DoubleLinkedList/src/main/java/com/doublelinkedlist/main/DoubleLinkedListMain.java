package com.doublelinkedlist.main;

public class DoubleLinkedListMain {
	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.createDLL(5);
		list.traverseDLL();

		list.insertInDLL(10, 1);
		list.traverseDLL();

		list.insertInDLL(20, 2);
		list.traverseDLL();

		list.insertInDLL(30, 3);
		list.traverseDLL();

		list.insertInDLL(40, 4);
		list.traverseDLL();

		System.out.println("\nSearching the node having value 40: ");
		list.searchNode(40);

		System.out.println("\n\nSearching the node having value 400: ");
		list.searchNode(400);

		System.out.println("\n\nLinked List in order");
		list.traverseDLL();

		System.out.println("\n\nDeleting the node having location = 2: ");
		System.out.println("List before deletion: ");
		list.traverseDLL();
		list.deleteDLL();
		System.out.println("List after deletion: ");
		list.traverseDLL();

	}

}
