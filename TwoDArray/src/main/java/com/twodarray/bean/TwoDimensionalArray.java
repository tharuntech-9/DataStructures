package com.twodarray.bean;

public class TwoDimensionalArray {
	int arr[][] = null;

	public TwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}

	public void traverseArray() {
		try {
			System.out.println("Printing the array now...");
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					System.out.print(arr[row][col] + "   ");
				}
			}
			System.out.println("\n");
		} catch (Exception e) {
			System.out.println("Array does not exists");
		}

	}

	public void insertValueInTheArray(int row, int col, int value) {
		try {
			if (arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("Successfully inserted " + value + " in the array.");
			} else {
				System.out.println("This cell is already occupied ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index ");

		}
	}

	public void accessSingleCell(int row, int col) {
		try {
			System.out.println("Cell value is: " + arr[row][col]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");

		}
		System.out.println("\n");
	}

	public void searchingSingleValue(int value) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (arr[row][col] == value) {
					System.out.println("Value is founud at location Row:" + row + " & Col:" + col);
					return;
				}
			}
		}
		System.out.println("Value is not found");

	}

	public void deleteValuefromArray(int deleteValueFromThisRow, int deleteValueFromThisCol) {
		try {
			System.out.println("Successfully deleted: " + arr[deleteValueFromThisRow][deleteValueFromThisCol]);
			arr[deleteValueFromThisRow][deleteValueFromThisCol] = Integer.MIN_VALUE;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println("Cant delete the value because not in the range of array ");

		}
	}

	public void deleteThisArray() {
		arr = null;
		System.out.println("Array has been succefully deleted");
	}

}
