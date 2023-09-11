package com.kn.switchcase;

import java.util.Scanner;

public class NumberOfDayInMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		scan.close();
		System.out.println(numberOfDays(month));
	}

	static int numberOfDays(int month) {
		return switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 2 -> 29;
		case 4, 6, 9, 11 -> 30;
		default -> 0;
		};
	}

}
