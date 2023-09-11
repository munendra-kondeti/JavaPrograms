package com.kn.ifelse;

import java.util.Scanner;

public class MultipleOfTen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = scan.nextInt();
		scan.close();
		boolean flage = isMultiple(num);
		if (flage)
			System.out.println("Multiple of Ten");
		else
			System.out.println("Not Multiple of Ten");

	}

	private static boolean isMultiple(int num) {
		if (num % 10 == 0)
			return true;
		else
			return false;
	}

}
