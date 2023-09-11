package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizenDiscoun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :- ");
		int age = scan.nextInt();
		scan.close();
		boolean flag = isEligible(age);
		if (flag)
			System.out.println("Your Eligible");
		else
			System.out.println("Not Eligible");

	}

	private static boolean isEligible(int age) {
		if (age >= 60)
			return true;

		return false;
	}

}
