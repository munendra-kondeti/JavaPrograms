package com.kn.arraymerging;

import java.util.Scanner;

public class MergeArrayDemo {

	public static void main(String[] args) {

		// Scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Array");

		// Array
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] brr = { 11, 12, 13, 14, 15 };

		// Object
		MergeArray array = new MergeArray();
		array.mearg(arr, brr);

		// Release the resources
		scanner.close();
	}

}
