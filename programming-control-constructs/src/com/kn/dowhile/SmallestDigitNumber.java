package com.kn.dowhile;

import java.util.Scanner;

public class SmallestDigitNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = scan.nextInt();
		scan.close();
		int smalNum = smallestDigt(num);
		System.out.println(smalNum);
	}

	private static int smallestDigt(int num) {
		int smallDigit = num%10;
		do {
			int r = num % 10;
			if (r <= smallDigit) {
				smallDigit = r;
			}
			
			 num /=10;
		}while (num > 0);
		return smallDigit;
	}

}
