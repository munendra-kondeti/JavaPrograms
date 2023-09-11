package com.kn.switchcase;

import java.util.Scanner;

public class IntegerToEnglishWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number from  0-9 ");
		int num = scan.nextInt();
		scan.close();
		System.out.println(intToWords(num));

	}

	static String intToWords(int num) {
		return switch (num) {
		case 0 -> "zero";
		case 1 -> "one";
		case 2 -> "two";
		case 3 -> "three";
		case 4 -> "four";
		case 5 -> "five";
		case 6 -> "six";
		case 7 -> "seven";
		case 8 -> "eight";
		case 9 -> "nine";
		default -> "Only 0-9 allowed";
		};

	}
}
