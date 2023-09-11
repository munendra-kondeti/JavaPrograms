package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		boolean flag = isPositive(num);
		if (flag)
			System.out.println("The given number " + num + " is +Ve");
//		else
//			System.out.println("The given number " + num + " is -Ve");
	}

	private static boolean isPositive(int num) {
		if (num > 0)
			return true;
		return false;
	}

}
