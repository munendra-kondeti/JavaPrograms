package com.kn.dsa;

public class InsertionSortDemo {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		// Array demo data
		int arr[] = { 5, 4, 10, 1, 6, 2 };
		System.out.println("Before sort");
		for (int element : arr)
			System.out.print(element);
		System.out.println();
		System.out.print("After sort");
		System.out.println();
		for (int element : insertionSort.sort(arr))
			System.out.print(element);

	}

}
