package com.binaryheap.main;

public class HeapByArrayMain {

	public static void main(String[] args) {
		System.out.println("Creating a blank Heap");
		HeapByArray heap = new HeapByArray(10);
		
		heap.insertInHeap(10);
		heap.insertInHeap(9);
		heap.insertInHeap(8);
		heap.insertInHeap(7);
		heap.insertInHeap(6);
		heap.insertInHeap(5);
		heap.insertInHeap(4);
		heap.insertInHeap(3);
		heap.insertInHeap(2);
		
		heap.extractHeadOfHeap();
		
		heap.insertInHeap(11);
		heap.extractHeadOfHeap();
		
	}
}
