package com.kn.nestedif;

import java.util.Scanner;

public class DrivingLicenceEligiblity {

	public static void main(String[] args) {
//		age and vision score
		boolean flag = isEligible();
		if (flag)
			System.out.println("Eligible For Driving Licence ");

	}

	private static boolean isEligible() {
		Scanner scan = new Scanner(System.in);
		// age and income
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		System.out.println("Enter your vision score ");
		int visionScore = scan.nextInt();
		scan.close();
		if (age >= 18) {
			if (visionScore <= 1)
				return true;
		}
		return false;
	}

}
