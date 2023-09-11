package com.kodnest.practice;

public class CheckPositive {

	public static void main(String[] args) {
		int num = 1;
		if (isPositive(num))
			System.out.println("Yes +ve");
		else
			System.out.println("Not");
	}

	private static boolean isPositive(int num) {
		if (num >= 0)
			return true;

		return false;
	}

}
