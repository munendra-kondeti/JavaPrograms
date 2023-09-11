package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a base number : - ");
		int base = scan.nextInt();
		System.out.println("Enetr a exponent  number : - ");
		int exponent = scan.nextInt();
		scan.close();
		int power = calculatePower(base, exponent);
		System.out.println(power);
	}

	static int calculatePower(int base, int exponent) {
		int power = 1;
		for (int i = 1; i <= exponent; i++) {
			power *= base;
		}
		return power;
	}

}
