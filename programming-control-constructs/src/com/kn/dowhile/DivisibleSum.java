package com.kn.dowhile;

import java.util.Scanner;

public class DivisibleSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number start end and devision ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		int divisor = scan.nextInt();
		scan.close();
		int cal = calculateDivisibleSum(start, end, divisor);
		System.out.println(cal);
	}

	static int calculateDivisibleSum(int start, int end, int divisor) {
		int sum = 0;
		do {
			if (start % divisor == 0) {
				sum += start;
			}
			start++;
		} while (start <= end);
		return sum;
	}

}
