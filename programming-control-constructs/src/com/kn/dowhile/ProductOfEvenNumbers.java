package com.kn.dowhile;

import java.util.Scanner;

public class ProductOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		scan.close();
		int product = findProductOfEvenNumbers(num);
		System.out.println(product);
	}

	private static int findProductOfEvenNumbers(int num) {
		int product = 1;
		int count = 1;
		int i = 2;
		do {
			if (i % 2 == 0) {
				count++;
				product *= i;
			}
			i++;
		} while (num >= count);
		return product;
	}

}
