package com.kn.arrayrotation;

public class RotateArray {
	// Method
	void rotateArray(int[] arr) {
		// {10,20,30,40,50};
		// left to right
//		int tempL = arr[0];
//		for (int j = 0; j < arr.length - 1; j++) {
//			arr[j] = arr[j + 1];
//			arr[j + 1] = tempL;
//		}
		// {10,20,30,40,50};
		// right to left
		int temp = arr[arr.length - 1];
		for (int j = arr.length - 1; j > 0; j--) {
			arr[j] = arr[j - 1];
			arr[j - 1] = temp;
		}

		// print
		for (int e : arr)
			System.out.println(e);
	}
}
