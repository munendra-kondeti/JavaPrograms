package com.kn.nestedif;

import java.util.Scanner;

public class LoanEligibility {

	public static void main(String[] args) {

		boolean flag = isElgibleForLoan();
		if (flag)
			System.out.println("Eligible");
		else
			System.out.println("Not Eligible");
	}

	private static boolean isElgibleForLoan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		scan.close();
		if (age >= 21) {
			System.out.println("Enter your income ");
			int income = scan.nextInt();
			if (income >= 21_000) {
				return true;
			}
		}
		return false;
	}

}
