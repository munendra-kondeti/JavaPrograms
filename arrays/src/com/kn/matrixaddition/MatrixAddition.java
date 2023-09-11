package com.kn.matrixaddition;

public class MatrixAddition {
	// matrix addition
	public void addition(int[][] arr, int[][] brr) {
		int crr[][] = new int[arr.length][arr[0].length];
		for(int i= 0 ; i< arr.length;i++) {
			for(int j = 0 ; j< arr[i].length;j++) {
				crr[i][j]=arr[i][j] + brr[i][j];
			}
		}
		
		printArray(crr);
	}

	private void printArray(int[][] twoDArray) {
		for(int[] first : twoDArray) {
			for(int second : first) {
				System.out.print(second+" ");
			}
			System.out.println();
		}
	}

}
