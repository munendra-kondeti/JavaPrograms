package com.kn.dowhile;

import java.util.Scanner;

public class ProductOfNOddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = scan.nextInt();
		scan.close();
		int calOddProd = calculateOddProduct(num);
		System.out.println(calOddProd);
	}

	private static int calculateOddProduct(int num) {
		int pOdd = 1;
		int i = 1;
		int tracker=1;
		do {
			if (i % 2 != 0) {
				pOdd = pOdd * i;
				tracker++;
			}
			i++;
		} while (tracker <= num);
		return pOdd;
	}

}
