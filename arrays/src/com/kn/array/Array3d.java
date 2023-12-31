package com.kn.array;

import java.util.Scanner;

public class Array3d {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner scan = new Scanner(System.in);
		// Array declaration and creation
		System.out.println("Enter the size of the array :- ");
		int size = scan.nextInt();
		int arr[][][] = new int[size][size][size];
		int brr[][][] = new int[size][size][size];

		arrayInitilization(arr, scan);
		arrayInitilization(brr, scan);
//		printingArray(arr);
		int[][][] crr =additionOfArrays(arr,brr);
		printingArray(crr);
	}

	// Array addition
	private static int[][][] additionOfArrays(int[][][] arr, int[][][] brr) {
		int crr[][][] = new int[arr.length][arr.length][arr.length];
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						for(int k=0;k<arr[i][j].length;k++) {
							crr[i][j][k] = arr[i][j][k] + brr[i][j][k];
						}
					}
				}
		return crr;
	}

	// This method Printing the array
	private static void printingArray(int[][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println("Data in "+j +" element ");
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}

	// This method for array initialization
	private static void arrayInitilization(int[][][] arr, Scanner scan) {
		// Array initilization
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
