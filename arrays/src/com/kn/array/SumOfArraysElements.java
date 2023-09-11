package com.kn.array;

import java.util.Scanner;

public class SumOfArraysElements {

	public static void main(String[] args) {
		// Scanner object create
		Scanner scan = new Scanner(System.in);
		
		// Array declaration and creation
		System.out.println("Enter the size of the array: ");
		// 1st array
		int arr[] = new int[scan.nextInt()];
		// 2nd array
		int brr[] = new int[arr.length];
		
		// Array initialization method calling
		arrayInitialization(arr,scan);
		arrayInitialization(brr,scan);
		
		printArray(sumOfArrayElements(arr,brr));
		
	}
	// printing 
	private static void printArray(int[] array) {
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]+" ");
		}
	}
	// Sum Of array by traversing each elements
	private static int[] sumOfArrayElements(int[] arr, int[] brr) {
		int crr[] = new int [arr.length];
		System.out.println("Sum doing ");
		for(int i = 0;i<arr.length;i++) {
			crr[i] = arr[i]+brr[i];
		}
		System.out.println("Sum done");
		return crr;
	}
	// method array initialization
	private static void arrayInitialization(int[] array, Scanner scan) {
		for(int i = 0;i<array.length;i++) {
			System.out.println("Enter the element data ");
			array[i]= scan.nextInt();
		}
	}

}
