package com.kodnest.practice;

public class Palandrom {

	public static void main(String[] args) {
		int num = 1323;
		if (isPalandrom(num))
			System.out.println("Yes");
		else
			System.out.println("Not");
	}

	private static boolean isPalandrom(int num) {
		int input = num, output = 0;
		while (num > 0) {
			int lastNumber = num % 10;
			output = (output * 10) + lastNumber;
			num /= 10;
		}
		if (input == output)
			return true;

		return false;
	}

}
