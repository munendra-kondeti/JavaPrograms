package com.kn.arraymerging;

public class MergeArray {
	// Merge two arrays
	public void mearg(int[] arr, int[] brr) {
		int[] crr = new int[arr.length+brr.length];
		for(int i = 0,j=0; i< crr.length-1 ;i=i+2,j++) {
			crr[i] = arr[j];
			crr[i+1] = brr[j];
		}
		
		for(int r : crr)
			System.out.println(r);
	}

}
