package com.kn.dsa;

public class BubbleSort {
	// Sorting the array
	int[] sort(int array[]) {
		// traversing every phase
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				// check the condition and swap
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
