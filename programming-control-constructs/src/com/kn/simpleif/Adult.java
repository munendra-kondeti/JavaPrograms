package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		scan.close();
		boolean flag = isAdult(age);
		if (flag)
			System.out.println("The person is Adult");
//		else
//			System.out.println("The person is NOTADULT");
	}

	static boolean isAdult(int age) {
		if (age > 21)
			return true;
		return false;
	}

}
