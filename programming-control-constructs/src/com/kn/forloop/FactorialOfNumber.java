package com.kn.forloop;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Enetr a number : - ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		System.out.println(factorialNumber(num));
	}

	static int factorialNumber(int num) {
		int factorial = 1;
		for (int i = 1;i <=num;i++) {
			factorial *= i;
		}
		return factorial;
	}

}
