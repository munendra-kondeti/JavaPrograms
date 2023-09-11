package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr your age to check Vote Eligible :- ");
		int age = scan.nextInt();
		scan.close();
		boolean flag = isVoteEligible(age);
		if (flag)
			System.out.println("Your Eligible ");
//		else
//			System.out.println("Not Eligible");
	}

	private static boolean isVoteEligible(int age) {
		if (age >= 18)
			return true;

		return false;
	}

}
