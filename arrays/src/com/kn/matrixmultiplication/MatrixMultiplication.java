package com.kn.matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	// Matrix multiplication
	public void multiplication(int[][] arr, int[][] brr) {

		int crr[][] = new int[arr.length][arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				crr[i][j] = 0;
				for (int k = 0; k < brr[i].length; k++) {
					crr[i][j] += arr[i][j] * brr[k][j];
				}
			}
		}
		// printing the output
		System.out.println("<<< Matrix multiplication >>>");
		printArray(crr);

	}

	// Takes array input
	public int[][] twoDArrayCreationAndInitializatio(int firstSize, int secondSize,Scanner scanner) {
		int[][] array = new int[firstSize][secondSize];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		return array;
	}

	// Print array
	private void printArray(int[][] array) {
		for (int[] firstD : array) {
			for (int element : firstD) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
