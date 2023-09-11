package com.kn.dsa;

public class BubbleSortingDemo {
	public static void main(String[] args) {
		// array creation
		int arr[] = { 32, 48, 11, 69, 5, 21 };
		// Creating constructor
		BubbleSort bubbleSort = new BubbleSort();
		// Calling the sort algorithm
		// Traversing
		for (int element : bubbleSort.sort(arr)) {
			System.out.print(element + " ");
		}
	}

}
