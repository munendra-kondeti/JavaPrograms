package com.kn.nestedif;

import java.util.Scanner;

public class AcceptThreeNumbers {

	public static void main(String[] args) {
		int num = LargerNumber();
		System.out.println("Your larger number " +num);
	}

	private static int LargerNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		scan.close();
		if (num1 == num2 & num2 == num3 & num3 == num1)
			return num1;
		if (num1 > num2)
			return num1;
		if (num2 > num3)
			return num2;
		return num3;
	}

}
