package com.kn.array;

public class ArrayElementsSum {
	// Declaration of arrays
	int[] firstArray, secondArray;

	// Constructor
	ArrayElementsSum(int[] firstArray, int[] secondArray) {
		this.firstArray = firstArray;
		this.secondArray = secondArray;
	}

	// Method to calculate Sum of arrays and return sum.
	int[] findSumOfArray(int firstArray[], int secondArray[]) {
		int sum[] = new int[firstArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			sum[i] = firstArray[i] + secondArray[i];
		}
		return sum;
	}
}
