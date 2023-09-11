package com.kn.dsa;

public class InsertionSort {
	// Method return the insertion sorted array
	int[] sort(int[] array) {
		// Checking the array size if 1 return same array
		if (array.length == 1)
			return array;
		// Right hand side traversing
		for (int rightSide = 0; rightSide < array.length; rightSide++) {
			int temp = array[rightSide];
			// Left side traversing
			for (int leftSide = rightSide - 1; leftSide >= 0; leftSide--) {
				// Condition checking
				if (array[leftSide] > temp && leftSide >= 0) {
					int presentArrayElement = array[leftSide];
					array[leftSide] = temp;
					array[leftSide + 1] = presentArrayElement;
				}
			}
		}

		return array;
	}
}
