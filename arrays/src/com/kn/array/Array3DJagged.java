package com.kn.array;

import java.util.Scanner;

public class Array3DJagged {

	public static void main(String[] args) {
		System.out.println("This is jagged array ");
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.println("Enter array base value : - ");
		int arr[][][] = new int[scan.nextInt()][][];

		subArrayCreation(arr, scan);
		arrayInitilization(arr, scan);
		arrayPrinting(arr);
	}

	// This method creates sub array
	private static void subArrayCreation(int[][][] arr, Scanner scan) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter 2nd dimention array size");
			arr[i] = new int[scan.nextInt()][];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter 3nd dimention array size");
				arr[i][j] = new int[scan.nextInt()];
			}
		}
	}

	// This method Printing the array
	private static void arrayPrinting(int[][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Data in " + j + " element ");
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}

	// This method for array initialization
	private static void arrayInitilization(int[][][] arr, Scanner scan) {
		// Array initialization
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Enter data for this element ");
					arr[i][j][k] = scan.nextInt();
				}
			}
		}

	}
}
