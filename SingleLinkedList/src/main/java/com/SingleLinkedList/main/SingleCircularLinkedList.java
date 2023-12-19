package com.SingleLinkedList.main;

import com.SingleLinkedList.node.*;

public class SingleCircularLinkedList {
	private SingleNode head;
	private SingleNode tail;
	private int size;// denotes size of list

	
	SingleNode createSingleLinkedList(int nodeValue) {
		head = new SingleNode();
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		node.setNext(node);
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public SingleNode getHead() {
		return head;
	}

	public void setHead(SingleNode head) {
		this.head = head;
	}

	public SingleNode getTail() {
		return tail;
	}

	public void setTail(SingleNode tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	void insertInLinkedList(int nodeValue, int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodeValue);
		System.out.println("Inserting new node at location: " + location);
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return;
		} else if (location == 0) {
			node.setNext(head);
			head = node;
			tail.setNext(node); 
		} else if (location >= size) {
			tail.setNext(node);
			tail = node;
			tail.setNext(head); 
		} else
		{
			SingleNode tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.getNext();
				index++;
			}
			node.setNext(tempNode.getNext());
			tempNode.setNext(node);			
		}
		size++;
	}

	public boolean existsLinkedList() {
		
		return head != null;
	}
	

	
	void traverseLinkedList() {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {

				System.out.print(tempNode.getValue());
				if (i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.getNext();
			}
			System.out.println("\n");
		}else {
			System.out.println("\nLinked List does not exists !");
		}
	}
	
	
	
	void printHeadUsingTail() {
		if (existsLinkedList()) {
			System.out.println("Printing Tail...");
			System.out.println(tail.getValue());
			
			System.out.println("Printing Head using Head reference...");
			System.out.println(head.getValue());
			
			System.out.println("Printing Head using Tail reference...");
			System.out.println(tail.getNext().getValue());
			
		}else{
			System.out.println("Linked List does not exists");
		}
	}

	
	
	void deleteLinkedList() {
		System.out.println("\n\nDeleting Linked List...");
		head = null;
		if(tail == null) {
			System.out.println("Linked List is already deleted, nothing to delete !");
			return;
		}else {
			tail.setNext(null);
			tail = null;
			System.out.println("Linked List deleted successfully !");
		}
	}
	
	
	
	boolean searchNode(int nodeValue) {
		if (existsLinkedList()) {
			SingleNode tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.getValue() == nodeValue) {
					System.out.print("Found the node at location: "+i);
					return true;
				}
				tempNode = tempNode.getNext();
			}
		}
		System.out.print("Node not found!! ");

		return false;
	}

	public void deletionOfNode(int location) {
		if (!existsLinkedList()) {
			System.out.println("The linked list does not exist!!");
			return;
		} else if (location == 0) {
			head = head.getNext();
			tail.setNext(head);
			setSize(getSize()-1);
			if(getSize() == 0) { 
				tail = null;
			}	
		}else if (location >= getSize()){
			SingleNode tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.getNext(); 
			}
			if (tempNode == head) {
				tail = head = null;
				setSize(getSize()-1);
				return;
			}
			tempNode.setNext(head); 
			tail= tempNode;
			setSize(getSize()-1);
			
		}else { 
			SingleNode tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.getNext(); 
			}	
			tempNode.setNext(tempNode.getNext().getNext()); 
			setSize(getSize()-1);
		}
		
	}
}
