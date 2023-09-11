package com.kn.array;

import java.util.Scanner;

public class SumOfArrays {

	public static void main(String[] args) {
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		// taking size from the user
		int size = scan.nextInt();
		// Array declaration and creation done
		int[] arr = new int[size];
		int brr[] = new int[size];
		// for 1st array
		arraysInitilazation(arr, scan);
		// for 2nd array
		arraysInitilazation(brr, scan);

		// Sum of arrays
		sumOfArrays(arr, brr);
		multOfArray(arr,brr);
	}
	//This 
	private static void multOfArray(int[] arr, int[] brr) {
		
	}

	// For printing or traversing the array
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Sum of array " + (1 + i) + " element " + array[i]);
		}
		System.out.println("Done");
	}

	// This method do sum of arrays
	private static void sumOfArrays(int[] arr, int[] brr) {
		// checking array are in same size or not
		if (arr.length == brr.length) {
			// declaring and creating a new array for sum.
			int crr[] = new int[arr.length];
			// traversing all
			for (int i = 0; i < arr.length; i++) {
				crr[i] = arr[i] + brr[i];
			}
			// Traversing and print this method.
			printArray(crr);
		} else {
			System.out.println("Arrays are not in same size");
		}
	}

	// Arrays Initilazation done this method
	private static void arraysInitilazation(int[] array, Scanner scan) {
		// Traversing the the array for adding the data in elements.
		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter value for array " + (1 + i) + " element");
			array[i] = scan.nextInt();
		}
		System.out.println("Done");
	}

}
