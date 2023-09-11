package com.kn.matrixaddition;

import java.util.Scanner;

public class MatrixAdditionDemo {

	public static void main(String[] args) {

		// Meassage 
		System.out.println("Matrix Addition");
		Scanner scanner = new Scanner(System.in);		
		// Array creation and declaration
		int[][] arr = new int[3][3];
		int[][] brr = new int[arr.length][arr.length];
		//Taking the values
		System.out.println("Enter values for arr");
		for(int i= 0 ; i< arr.length;i++) {
			for(int j = 0 ; j< arr[i].length;j++) {
				arr[i][j] = scanner.nextInt();
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter values for brr");
		for(int i= 0 ; i< arr.length;i++) {
			for(int j = 0 ; j< arr[i].length;j++) {
				brr[i][j] = scanner.nextInt();
				System.out.print(" ");
			}
			System.out.println();
		}
		// Create objects
		MatrixAddition matrix= new MatrixAddition();
		// Call method
		matrix.addition(arr,brr);
		
		// Release the resources
		
		
	}

}
