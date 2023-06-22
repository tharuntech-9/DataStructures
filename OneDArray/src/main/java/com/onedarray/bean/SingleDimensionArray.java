package com.onedarray.bean;

public class SingleDimensionArray {
	int arr[] = null;

	public SingleDimensionArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	public void traverseArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array no doesn't exist");
		}
	}

	public void insert(int location, int valueToBeInserted) {
		try {
			if (arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Successfully inserted " + valueToBeInserted + "at location:" + location);
			} else {
				System.out.println("This cell is already occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");

		}
	}

	public void accessingCell(int cellNo) {
		try {
			System.out.println(arr[cellNo]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access array !");

		}
	}

	public void searchInAnArray(int Search) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Search) {
				System.out.println("Value found !");
				System.out.println("Index of " + Search + " is: " + i);
				return;
			}
		}
		System.out.println(Search + " is not found");
	}

	public void deleteValueFromArray(int deleteValueFromThisCell) {
		try {
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value");

		}
	}

	public void deleteThisArray() {
		arr = null;
		System.out.println("Array has been succefully deleted");
	}

}
