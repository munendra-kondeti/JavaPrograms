package com.kn.elseifladder;

import java.util.Scanner;

public class NegativePositiveOrZero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = scan.nextInt();
		scan.close();
		isPositive(num);

	}

	private static void isPositive(int num) {
		if (num > 0)
			System.out.println("+ve");
		else if (num < 0)
			System.out.println("-ve");
		else
			System.out.println("0 / Nutral");
	}

}
