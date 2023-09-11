package com.kn.dsa;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// default values
		int arr[] = { 48, 32, 16, 29, 72, 44, 63 };
		// creating object
		SelectionSort selectionSort = new SelectionSort(arr);
		// traversing
		for (int element : selectionSort.sort()) {
			System.out.println(element + " ");
		}
	}

}
