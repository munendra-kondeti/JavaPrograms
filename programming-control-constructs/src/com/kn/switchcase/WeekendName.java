package com.kn.switchcase;

import java.util.Scanner;

public class WeekendName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter weekend number :- ");
		int weekendNumber = scan.nextInt();
		scan.close();
		System.out.println(weekendName(weekendNumber));
		
	}

	static String weekendName(int weekendNumber) {
		return switch (weekendNumber) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Not a Valid";
		};
	}

}
