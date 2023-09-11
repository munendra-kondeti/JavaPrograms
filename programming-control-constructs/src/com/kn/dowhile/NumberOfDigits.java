package com.kn.dowhile;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		scan.close();
		int digits = findNumberOfDigits(num);
		System.out.println(digits);
	}

	private static int findNumberOfDigits(int num) {
		int count = 0;
		do {
			count++;
			num /= 10;
			
		}while (num > 0);
		return count;
	}

}
