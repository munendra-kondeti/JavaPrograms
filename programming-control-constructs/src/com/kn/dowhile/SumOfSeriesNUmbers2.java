package com.kn.dowhile;

import java.util.Scanner;

public class SumOfSeriesNUmbers2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n number ");
		int n = scan.nextInt();
		scan.close();
		int sumOfN = sumofNumbers(n);
		System.out.println(sumOfN);

	}

	private static int sumofNumbers(int n) {
		int sum = 0;
		int i = 1;
		do {
			sum =sum+ i*i;
			i++;
		} while (i <= n);
		return sum;
	}

}
