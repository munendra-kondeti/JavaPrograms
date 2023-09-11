package com.kn.elseifladder;

import java.util.Scanner;

public class QuadrantCoordinates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x value ");
		int x = scan.nextInt();

		System.out.println("Enter y value ");
		int y = scan.nextInt();
		scan.close();
		identifiesQuadrent(x, y);

	}

	private static void identifiesQuadrent(int x, int y) {
		if (x > 0 & y > 0)
			System.out.println("Q1");
		else if (x < 0 & y > 0)
			System.out.println("Q2");
		else if (x < 0 & y < 0)
			System.out.println("Q3");
		else if (x > 0 & y < 0)
			System.out.println("Q4");

	}

}
