package com.kn.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		// data
		int arr[] = {1,2,3,4,5};
		System.out.println(binarySearch(arr,5));
		
	}
	static int binarySearch(int arr[] ,int target) {
		
		int left=0,right=arr.length;
		for(int i =0; i<arr.length;i++) {
			int mid = (left+right)/2;
			if(arr[mid]== target) {
				return mid;
			}
			else if(target < arr[mid +1]) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		
		return -1;
	}
}
