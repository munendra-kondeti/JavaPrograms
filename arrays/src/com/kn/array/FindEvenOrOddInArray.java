package com.kn.array;

import java.util.Scanner;

public class FindEvenOrOddInArray {

	public static void main(String[] args) {
		// Scanner object creating
		Scanner scan = new Scanner(System.in);

		// Array Declaration and creation
		System.out.println("Enter the size of the array: ");
		int arr[] = new int[scan.nextInt()];

		// Array initializing
		arrayInitializing(arr, scan);
		printEvenOrOdd(arr);
		// Creating the count even and odd object
		CountEvenAndOdd printEvenAndOddCount = new CountEvenAndOdd();
		// calling the count even and odd method by passing array
		printEvenAndOddCount.coutnEvenAndOdd(arr);
	}

	// Method checks and print the even and odd with index of the element
	private static void printEvenOrOdd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println("Even number at index " + i + " and the element = " + arr[i]);
			else
				System.out.println("Odd number at index " + i + " and the element = " + arr[i]);
		}
	}

	// This method initilize the array data
	static void arrayInitializing(int[] arr, Scanner scan) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element data ");
			arr[i] = scan.nextInt();
		}
		System.out.println("...Array initilization done...");
	}

}
