package com.kn.whileloop;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = scan.nextInt();
		scan.close();
		System.out.println(findSeriesOfSum(num));
	}

	static double findSeriesOfSum(int num) {
		double sum = 0;
		double i = 1;
		while (i <= num) {
			sum += (1 / i);
			i++;
		}

		return sum;
	}

}
