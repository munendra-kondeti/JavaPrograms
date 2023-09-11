package com.kn.rotationofarray;

public class ArrayRotationRightSide {
	// this method rotates the given array
	int[] arrayRotation(int[] array, int numberOfRotations) {
		int count = 0;
		while (count < numberOfRotations) {
			int temp = array[0];
			for (int j = 0; j < array.length - 1; j++) {
				array[j] = array[j + 1];
			}
			array[array.length - 1] = temp;
			count++;
		}
		return array;
	}
}
