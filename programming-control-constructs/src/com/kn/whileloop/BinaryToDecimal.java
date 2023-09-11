package com.kn.whileloop;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("give a binary value ");
		int num = scan.nextInt();
		scan.close();
		System.out.println(decimalNumber(num));
	}

	static int decimalNumber(int num) {
		int decimalValue = 0;
		int count = 0;
		while (num > 0) {
			int r = num % 10;
			if (r > 0)
				decimalValue += (r * power(count++));
			else
				count++;
			num /= 10;
		}
		return decimalValue;
	}

	static int power(int expo) {
		int power = 1;
		for (int i = 1; i <= expo; i++) {
			power *= 2;
		}
		return power;
	}
}
