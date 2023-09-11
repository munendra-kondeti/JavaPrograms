package com.kn.matrixmultiplication;

import java.util.Scanner;

public class MatrixMultiplicationDemo {

	public static void main(String[] args) {
		// Create object
		MatrixMultiplication matrix = new MatrixMultiplication();

		// Scanner object
		Scanner scanner = new Scanner(System.in);
		// User input object
		System.out.println("<<Matrix multiplication>>");
		System.out.println("Enter 1st array values ");
		int[][] arr = matrix.twoDArrayCreationAndInitializatio(3, 3, scanner);
		System.out.println("Enter 2nd array values ");
		int[][] brr = matrix.twoDArrayCreationAndInitializatio(3, 3, scanner);
		// Call method
		matrix.multiplication(arr, brr);
		// Release the resources
		scanner.close();

	}

}
