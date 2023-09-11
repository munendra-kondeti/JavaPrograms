package com.kn.array;

import java.util.Scanner;

public class FindNumberInGivenElements {

	public static void main(String[] args) {
		
		// Scanner for taking input
		Scanner scan = new Scanner(System.in);
		
		// array declaration and creation
		System.out.println("Enter size of an array : ");
		int arr[] = new int[scan.nextInt()];
		//Array element data taken here
		for (int i = 0 ; i< arr.length ;i++) {
			System.out.print("Enetr the data for the element of "+(i+1));
			arr[i]=scan.nextInt();
		}
		// Taking the search data
		System.out.println("Enter the int number you need to search");
		
		// Method calling
		findElementInGivenArray(arr,scan.nextInt());
		scan.close();
	}
	
	// Method for searching element index
	private static void findElementInGivenArray(int[] arr, int nextInt) {
		for( int  i = 0; i<arr.length;i++) {
			if(arr[i]==nextInt) {
				System.out.println("Its there in this index of "+ i);
			}
			else {
				System.out.println("Not found");
			}
		}
	}

}
