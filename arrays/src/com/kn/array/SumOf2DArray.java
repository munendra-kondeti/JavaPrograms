package com.kn.array;

import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args) {
		// Scanner object
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.println("Enter the size of the array ");
		int arr[][] = new int[scan.nextInt()][5];
		int brr[][] = new int[arr.length][arr[0].length];

		// Array Intinalization
		arraysInitilazation(arr, scan);
		arraysInitilazation(brr, scan);
		// sum of arrays
		sumOfArrays(arr, brr);
	}

	// Arrays Initilazation done this method
	private static void arraysInitilazation(int[][] array, Scanner scan) {
		// Traversing the the array for adding the data in elements.
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array of " + (i + 1));
			for (int j = 0; j < array[0].length; j++) {
				System.out.print("Enter value for element " + (1 + j) + " : ");
				array[i][j] = scan.nextInt();
			}
		}
		System.out.println("Done");
	}

	// This method do sum of arrays
	private static void sumOfArrays(int[][] arr, int[][] brr) {
		// checking array are in same size or not
		if (arr.length == brr.length) {
			// declaring and creating a new array for sum.
			int crr[][] = new int[arr.length][arr[0].length];
			// traversing all
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					crr[i][j] = arr[i][j] + brr[i][j];
				}
			}
			// Traversing and print this method.
			printArray(crr);
		} else {
			System.out.println("Arrays are not in same size");
		}
	}

	// For printing or traversing the array
	public static void printArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Sum of array of " + (i + 1));
			for (int j = 0; j < array[0].length; j++) {
				System.out.println("Sum in array " + (i + 1) + " and " + (1 + j) + " element " + array[i][j]);
			}
		}
		System.out.println("Done");
	}

}
