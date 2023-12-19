package com.queue.list;

import com.SingleLinkedList.main.SingleLinkedList;

public class QueueByLinkedList {

	SingleLinkedList list;

	public QueueByLinkedList() {
		list = new SingleLinkedList();
	}

	public void enQueue(int value) {
		if (list.getHead() == null) {
			list.createSingleLinkedList(value);
		} else {

			list.insertInLinkedList(value, list.getSize());
		}
	}

	public int deQueue() {
		int value = -1;
		if (isQueueEmpty()) {
			System.out.println("Queue underflow error");
		} else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
	}

	public int peek() {
		if (!isQueueEmpty())
			return list.getHead().getValue();
		else {
			System.out.println("The queue is empty");
			return -1;
		}
	}

	public boolean isQueueEmpty() {
		if (list.getHead() == null)
			return true;
		else
			return false;
	}

	public void deleteStack() {
		list.setHead(null);
	}

}
