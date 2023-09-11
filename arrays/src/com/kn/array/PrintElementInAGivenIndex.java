package com.kn.array;

import java.util.Scanner;

public class PrintElementInAGivenIndex {

	public static void main(String[] args) {
		
		// Taken input from the user
		Scanner scan = new Scanner(System.in);
		
		// array declaration and creation and taken size from the user
		System.out.println("Enter the array size : ");
		
		int[] arr= new int[scan.nextInt()];
		
		//Taking the input value from the user for array
		for (int i =0;i<arr.length;i++) {
			System.out.print("Enter value for the elements " + (i+1) +" = ");
			arr[i]=scan.nextInt();
		}
		
		// Take input from the user for asking the index
		System.out.println("Enter the index value you need to find : ");
		
		printIndexOfTheElement(arr,scan.nextInt());
	}

		// printing the element data for the given index 
	private static void printIndexOfTheElement(int[] arr, int index) {
		if(index > arr.length-1 ) {
			System.out.println("Index Out of range ");
		}
		else {
			System.out.println(arr[index]);
		}
	}

}
