package com.kn.forloop;

import java.util.Scanner;

public class NPrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number :- ");
		int n = scan.nextInt();
		scan.close();
		printNPrimeNumbers(n);
	}

	private static void printNPrimeNumbers(int n) {

		printNPrime(n);
		System.out.println(" ");
		printPrimes(n);
	}

	static void printPrimes(int n) {
		int num = n;
		for (int i = 2; i <= num; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2)
				System.out.print(i + " ");
		}
	}

	private static void printNPrime(int n) {
		System.out.print("Prime numers :-  ");
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
