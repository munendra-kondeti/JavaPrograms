package com.kn.dsa;

public class SelectionSort {
	// array declaration
	int array[];

	public SelectionSort(int array[]) {
		this.array = array;
	}

	// Array sorting
	int[] sort() {
		for (int i = 0; i < array.length - 1; i++) {
			// min and index tracking
			int min = array[i], index = i;
			for (int j = i + 1; j < array.length; j++) {
				// comparing min and present value of the unsorted array
				if (array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			// Swap
			int temp = array[i];
			array[i] = min;
			array[index] = temp;
		}

		return array;
	}
}
