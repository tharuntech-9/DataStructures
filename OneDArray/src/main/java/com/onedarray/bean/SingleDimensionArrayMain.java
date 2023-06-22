package com.onedarray.bean;

public class SingleDimensionArrayMain {

	public static void main(String[] args) {

		System.out.println("Creating a blank array of size 10");
		SingleDimensionArray sda = new SingleDimensionArray(10);

		System.out.println("Printing the Array");
		sda.traverseArray();

		System.out.println("Inserting values in array");
		sda.insert(0, 0);
		sda.insert(10, 10);
		sda.insert(29, 20);
		sda.insert(35, 30);
		sda.insert(47, 40);
		sda.insert(54, 50);
		sda.insert(63, 60);
		sda.insert(71, 70);
		sda.insert(82, 80);
		sda.insert(10, 100);
		sda.insert(12, 120);

		System.out.println("Printing the Array ");
		sda.traverseArray();

		System.out.println("Accessing cell number 1 ");
		sda.accessingCell(1);
		System.out.println();
		System.out.println();

		System.out.println("Accessing cell number 5");
		sda.accessingCell(5);

		System.out.println("Searching 30 in the array");
		sda.searchInAnArray(30);

		System.out.println("Searching 400 in the array");
		sda.searchInAnArray(400);

		System.out.println("Deleting value");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(3);
	
		System.out.println("After Deleting ");
		sda.traverseArray();
		
		sda.deleteThisArray();
		System.out.println("After Deleting ");
		sda.traverseArray();

	}
}
