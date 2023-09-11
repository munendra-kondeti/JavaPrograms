package com.kn.array;

import java.util.Scanner;

public class CopyArrayToAnotherArray {

	public static void main(String[] args) {
		// Scanner object create
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		System.out.println("Enter the size of the array :- ");
		int[] arr = new int[scan.nextInt()];
		// Initilizing array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element data");
			arr[i] = scan.nextInt();
		}
		// Declaring and creating the duplicate array
		int[] brr = new int[arr.length];
		// Copying the data from arr to brr
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element data");
			brr[i] = arr[i];
		}
		System.out.println("Successfully copyed from 1array to another array");
		// Traversing the array 
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The elements data in brr = " +brr[i]+" and arr = "+arr[i]);
		}
		
	}

}
