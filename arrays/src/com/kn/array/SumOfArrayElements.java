package com.kn.array;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// Scanner object
		Scanner scan = new Scanner(System.in);
		// Declaration and creation
		int arr[] = new int [scan.nextInt()];
		// array initiazation
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Enter the element data ");
			arr[i] = scan.nextInt();
		}
		int sum =0;
		// sum of the elements in same array
		for(int i =0;i<arr.length;i++) {
			System.out.println("Suming....");
			sum += arr[i];
		}
		System.out.println(sum+"sum of the array ");
	}

}

