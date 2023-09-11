package com.kn.forloop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enetr a number ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		rNumber(num);
	}

	static void rNumber(int num) {
		for (; num > 0;) {
			int r = num % 10;
			System.out.print(r);
			num /= 10;
		}
	}

}
