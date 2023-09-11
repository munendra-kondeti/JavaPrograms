package com.kn.switchcase;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("corresponding day of the week. -> ");
		int day = scan.nextInt();
		scan.close();
		System.out.println(dayToWeek(day));
	}

	private static String dayToWeek(int day) {
		return switch (day) {
		case 1 -> "Monday";
		case 2 -> "Monday";
		case 3 -> "Monday";
		case 4 -> "Monday";
		case 5 -> "Monday";
		case 6 -> "Monday";
		case 7 -> "Monday";
		default -> "Not Valid";
		};
	}

}
