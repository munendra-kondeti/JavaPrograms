package com.kn.array;

import java.util.Scanner;

public class CopyArrayByUsingMethods {

	public static void main(String[] args) {
		// Scanner object create
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.println("Enter the size of the array :- ");
		int[] arr = new int[scan.nextInt()];
		// Method calling for initializing
		arrayInitializing(arr, scan);
		// Copying method calling
		arrayToCopyFromArraytoArray(arr);

		printArrayInForword(arr);
		printArrayInReverse(arr);
		// Closing the scanner object
		scan.close();
	}
	// Method in reverse way
	private static void printArrayInReverse(int[] arr) {
		System.out.println("Reverse order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The element data " + arr[i]);

		}
	}

	// Method printing forward way
	private static void printArrayInForword(int[] arr) {
		System.out.println("Forword way");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The element data " + arr[i]);

		}
	}
	// array To Copy From Array to Array
	private static int[] arrayToCopyFromArraytoArray(int[] arr) {
		// Duplicate array declaration and creation
		int[] brr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		return brr;
	}

	// Method for initializing array
	private static void arrayInitializing(int[] arr, Scanner scan) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element data");
			arr[i] = scan.nextInt();
		}
	}

}
