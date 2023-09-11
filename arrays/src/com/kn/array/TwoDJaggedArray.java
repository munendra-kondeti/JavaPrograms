package com.kn.array;

public class TwoDJaggedArray {

	public static void main(String[] args) {
		// Array Declaration
		int[][] arr = new int[2][];
		// Array Creation
		arr[0] = new int[3];
		arr[1] = new int[2];

		// Array Initilazation method calling
		arrayIntelization(arr);
		
		// Array Traversing method calling
		arrayTraversing(arr);
	}

	// This method for Traversing the array
	private static void arrayTraversing(int[][] arr) {
		// here i is for getting base of the array 
		for (int i = 0 ; i < arr.length ; i++) {
			// here j for getting the element of the data
			for(int j = 0 ; j< arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	// Array Initilazation method
	static void arrayIntelization(int[][] arr) {
		// Reference data
		int k = 10;
		// i is for getting the base of the array
		for (int i = 0; i < arr.length; i++) {
			// j is for getting the access of the element
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = k++;
			}
		}
	}

}
