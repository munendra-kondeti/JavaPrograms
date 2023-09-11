package com.kn.array;

public class CountEvenAndOdd {

	// Method count even and odd of the given array
	void coutnEvenAndOdd(int[] arr) {
		// tracking variables
		int evenCount = 0, oddCount = 0;
		// traversing
		for (int i = 0; i < arr.length; i++) {
			// condition checking
			int d = (arr[i] % 2 == 0) ? evenCount++ : oddCount++;
		}
		System.out.println("Even total count " + evenCount + "\nOdd total count " + oddCount);
	}
}
