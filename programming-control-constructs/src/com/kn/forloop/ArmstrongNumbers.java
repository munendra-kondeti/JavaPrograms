package com.kn.forloop;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enater a number ");
		int num = scan.nextInt();
		scan.close();
		printAmstrongNumbers(num);

	}

	static void printAmstrongNumbers(int num) {
		for (int i = 1; i <= num; i++) {
			if (isAmstrongNumber(i))
				System.out.println(i);
		}
	}

	private static boolean isAmstrongNumber(int num) {
		int temp = num;
		int fianlNumber = 0;
		for (; num > 0;) {
			int r = num % 10;
			r = r * r * r;
			fianlNumber += r;
			num /= 10;
		}
		if (temp == fianlNumber)
			return true;
		return false;
	}

}
