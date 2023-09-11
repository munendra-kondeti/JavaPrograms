package com.kn.array;

import java.util.Scanner;

public class BackwordTraversingArrayElementsUsingMethod {

	public static void main(String[] args) {
		// scanner object create
		Scanner scan = new Scanner(System.in);
		// Array declaration and creation
		System.out.println("Enter the array size :  ");
		int arr[] = new int[scan.nextInt()];

		// array initialization
		arrayInitialization(arr, scan);

		// array backward traversing
		arrayBackwardTravesing(arr);
		
		// closing scanner
		scan.close();
	}

	// arrayBackwardTravesing
	private static void arrayBackwardTravesing(int[] array) {
		for (int i = array.length - 1; i > -1; i--) {
			System.out.println("The data :  " + array[i]);
		}
	}

	// Array initialization method
	private static void arrayInitialization(int[] array, Scanner scan) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element data : - ");
			array[i] = scan.nextInt();
		}
	}

}
