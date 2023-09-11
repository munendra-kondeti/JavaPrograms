package com.kn.whileloop;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a numbers ");
		int num = scan.nextInt();
		scan.close();
		int product = findProductOfNumber(num);
		System.out.println(product);
	}

	private static int findProductOfNumber(int num) {
		int product = 1;
		while (num > 0) {
			int r = num % 10;
			product *= r;
			num /= 10;
		}
		return product;
	}

}
