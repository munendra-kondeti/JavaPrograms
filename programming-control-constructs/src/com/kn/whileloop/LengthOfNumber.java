package com.kn.whileloop;

import java.util.Scanner;

public class LengthOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n numbers ");
		int num = scan.nextInt();
		scan.close();
		System.out.println("Length of number "+ findLengthOfNUmber(num));
	}

	private static int findLengthOfNUmber(int num) {
		int length = 0;
		while (num >0) {
			int r= num % 10;
			length++;
			num/=10;
		}
		return length;
	}

}
