package com.kn.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		scan.close();
		boolean flag = isPalindrome(num);
		if (flag)
			System.out.println("it's a palindrome");
		else
			System.out.println("Not a palindrome");
	}

	static boolean isPalindrome(int num) {
		int temp = num;
		int tracker = 0;
		for (; num > 0;) {
			int r = num % 10;
			tracker = tracker * 10 + r;
			num /= 10;
		}
		if (temp == tracker)
			return true;
		return false;
	}

}
