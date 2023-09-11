package com.kn.ifelse;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year ");
		int year = scan.nextInt();
		scan.close();
		boolean flag = isLeapYear(year);
		if (flag)
			System.out.println("Give year is a Leap year " + year);
		else
			System.out.println("Not a leap year ");
	}

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					return true;
				else
					return false;
			} else
				return true;
		} else
			return false;
	}

}
