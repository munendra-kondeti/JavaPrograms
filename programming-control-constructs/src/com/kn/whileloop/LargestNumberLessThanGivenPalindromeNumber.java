package com.kn.whileloop;

import java.util.Scanner;

public class LargestNumberLessThanGivenPalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number for  the largest number less than a given number which is a palindrome ");
		int num = scan.nextInt();
		scan.close();
		findLargestLessPalindrome(num);
	}

	private static void findLargestLessPalindrome(int num) {
		int temp = num, tracker = 0;
		while (true) {
			num = temp - 1;
			temp = num;
			while (num > 0) {
				int r = num % 10;
				tracker = tracker * 10 + r;
				num /= 10;
			}
			if (temp == tracker) {
				System.out.println("Largest number less then given number:- " + temp);
				break;
			} else {
				tracker = 0;
			}
		}

	}

}
