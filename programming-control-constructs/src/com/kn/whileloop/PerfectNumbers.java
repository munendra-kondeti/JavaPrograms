package com.kn.whileloop;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n number ");
		int num = scan.nextInt();
		scan.close();
		printPerfectNumber(num);
	}

	private static void printPerfectNumber(int num) {
		int i = 1;
		while (i <= num) {
			if (isPerfectNumber(i)) {
				System.out.print(i);
				System.out.print(" ");
			}
			i++;
		}
	}

	private static boolean isPerfectNumber(int num) {
		int sum = 0, temp = num, i = 1;
		while (i < num) {
			if (num % i == 0)
				sum += i;
			i++;
		}
		if (temp == sum)
			return true;
		return false;
	}

}
