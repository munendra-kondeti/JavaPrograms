package com.kn.whileloop;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n numbers ");
		int num = scan.nextInt();
		scan.close();
		System.out.println("Sum of n Odd numbers "+findSumOfOdd(num));
	}

	private static int findSumOfOdd(int num) {
		int sumOfOdds = 0;
		int i = 0;
		while (i <= num) {
			if (i % 2 != 0)
				sumOfOdds += i;
			i++;
		}
		return sumOfOdds;
	}

}
