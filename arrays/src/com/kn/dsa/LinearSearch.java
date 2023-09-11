package com.kn.dsa;

public class LinearSearch {

	public static void main(String[] args) {
		// Array demo data
		int arr[] = { 48, 32, 16, 29, 72, 44, 63 };

		int target = 29;
		int flag = leanearSearch(arr, target);
		if (flag >= 0)
			System.out.println(flag);
		else
			System.out.println("Not found");
	}

	// linear search method
	static int leanearSearch(int arr[], int target) {

		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return index;
	}

}
