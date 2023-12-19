package com.SLL.bean;

import com.SingleLinkedList.node.SingleNode;

import lombok.Data;

@Data
public class SingleLinkedList {

	private SingleNode head;
	private SingleNode tail;
	private int size;

	public SingleNode createSLL(int nodevalue) {
		head = new SingleNode();
		SingleNode singleNode = new SingleNode();
		singleNode.setValue(nodevalue);
		singleNode.setNext(null);
		head = singleNode;
		tail = singleNode;
		size = 1;
		return head;
	}
	
	public void insertSLL(int nodevalue,int location) {
		SingleNode node = new SingleNode();
		node.setValue(nodevalue);
		
		if(!existsLinkedlist()) {
			node.setNext(head);
			head = node;
			return;
		}else if(location == 0) {
			node.setNext(head);
			head = node;
		}else if(location >= size) {
			node.setNext(null);
			tail.setNext(node);
			tail = node;
		}else {
			SingleNode tempnode = head;
			int index =0;
			while(index < location - 1) {
				tempnode  = tempnode.getNext();
				index++;
			}
			SingleNode nexNode = tempnode.getNext();
			tempnode.setNext(node);
			node.setNext(nexNode);
		}
		setSize(getSize() + 1);
	}

	public boolean existsLinkedlist() {
		return head != null;
	}

}
