package com.twodarray.bean;

public class TwoDimensionalArrayMain {

	public static void main(String[] args) {

		TwoDimensionalArray sda = new TwoDimensionalArray(5, 5);
		sda.traverseArray();

		sda.insertValueInTheArray(0, 2, 100);
		sda.traverseArray();

//		sda.insertValueInTheArray(0, 2, 101);
//		sda.traverseArray();

		sda.accessSingleCell(0, 2);
		sda.accessSingleCell(3, 2);
		sda.accessSingleCell(2, 2);

		sda.searchingSingleValue(10);
		sda.searchingSingleValue(-2147483648);
		sda.searchingSingleValue(101);

		sda.deleteValuefromArray(0, 2);
		sda.traverseArray();

		sda.deleteThisArray();
		sda.traverseArray();

	}
}
