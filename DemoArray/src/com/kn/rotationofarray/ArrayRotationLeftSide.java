package com.kn.rotationofarray;

public class ArrayRotationLeftSide {

	// Method for rotating the array to left side
	int[] arrayRotationLeftSide(int[] array, int numberOfRotations) {

		int count = 1;
		while (count <= numberOfRotations) {
			int temp = array[0];
			for (int i = 0; i < array.length; i++) {
				array[i] = array[array.length - 1];
			}
			array[array.length - 1] = temp;
			count++;
		}

		return array;
	}
}
