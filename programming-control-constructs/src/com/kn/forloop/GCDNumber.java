package com.kn.forloop;

import java.util.Scanner;

public class GCDNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 2 numbers ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int gcd = findGCD(num1, num2);
		System.out.println("your GCD " + gcd);
	}

	private static int findGCD(int num1, int num2) {
		int gcd = 1;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		return gcd;
	}

}
