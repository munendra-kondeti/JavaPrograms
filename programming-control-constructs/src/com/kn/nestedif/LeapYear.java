package com.kn.nestedif;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year ");
		int year = scan.nextInt();
		scan.close();
		boolean leaoYear = isLeapYear(year);
		System.out.println("the given year "+year +" is "+leaoYear);
	}

	static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 100) {
				if (year % 400 == 0)
					return true;
				else
					return false;
			} else
				return true;
		}
		return false;
	}

}
