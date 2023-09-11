package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Letter ");
		char letter = scan.next().charAt(0);
		scan.close();
		boolean flag = isCapitalLetter(letter);
		if (flag)
			System.out.println("It's a Capital Letter");
//		else
//			System.out.println("Not a Capital Letter");
	}

	private static boolean isCapitalLetter(char letter) {
		if (letter >= 65 && letter <= 90)
			return true;

		return false;
	}

}
