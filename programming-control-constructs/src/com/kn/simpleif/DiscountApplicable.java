package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the amount $  ");
		double amount = scan.nextDouble();
		scan.close();
		boolean flag = isDiscountApplicable(amount);
		if (flag)
			System.out.println("Discount Applicable");
//		else 
//			System.out.println("Discount Not Applicable");
	}

	private static boolean isDiscountApplicable(double amount) {
		if (amount > 100)
			return true;

		else
			return false;
	}

}
