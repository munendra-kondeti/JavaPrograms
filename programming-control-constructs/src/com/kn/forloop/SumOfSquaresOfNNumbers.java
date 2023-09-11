package com.kn.forloop;

import java.util.Scanner;

public class SumOfSquaresOfNNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number n ");
		int n = scan.nextInt();
		scan.close();
		sumOfSquareNumbers(n);
	}

	private static void sumOfSquareNumbers(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += squareNumber(i);
		}
		System.out.println(+sum);
	}

	static int squareNumber(int n) {
		return n * n;
	}

}
