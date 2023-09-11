package com.kn.array;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array declaration
		int[] arr;
		
		// Array Creation
		System.out.println("Enter array size : ");
		
		arr = new int[scan.nextInt()];
		
		// Array initilization
		
		for (int i =0; i< arr.length ; i++) {
			System.out.println("Eneter int data for the element "+(i+1)+" = ");
			arr[i] = scan.nextInt();
			
		}
		// Array forward traversing
		System.out.println();
		for (int i=0; i< arr.length ; i++) {
			System.out.println(arr[i]);
		}
		// Array reverse taversing 
		System.out.println("Array reverse tavering");
		for (int i=arr.length-1;i > -1 ; i--) {
			System.out.println(arr[i]);
		}
		
	}

}
