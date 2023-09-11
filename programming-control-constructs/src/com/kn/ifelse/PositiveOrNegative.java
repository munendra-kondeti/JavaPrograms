package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = scan.nextInt();
		scan.close();
		boolean flag = isPositive(num);
		if (flag)
			System.out.println("Positive");
		else
			System.out.println("Negitive");

	}

	private static boolean isPositive(int num) {
		if (num >= 0)
			return true; // 0 conside as +ve
		return false;
	}

}
