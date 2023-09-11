package com.kn.dowhile;

import java.util.Scanner;

public class SumBecomeSingleDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr number ");
		int num = scan.nextInt();
		scan.close();
		int sumOfD = findSumOfDigits(num);
		System.out.println(sumOfD);
	}

	private static int findSumOfDigits(int num) {
		int sum = 0;
		do {
			int lstDigit = num % 10;
			sum = sum + lstDigit;
			num /= 10;
			if (sum > 9 & num == 0) {
				num = sum;
				sum = 0;
			}
		} while (num > 0);
		return sum;
	}

}
