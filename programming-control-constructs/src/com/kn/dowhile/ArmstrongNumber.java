package com.kn.dowhile;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting and end number ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		scan.close();
		printArmstrongNumbers(start, end);
	}

	public static void printArmstrongNumbers(int start, int end) {

		do {
			int sum = 0, temp = start,num=start;
			while (num > 0) {
				int r = num % 10;
				sum += r * r * r;
				num /= 10;
			}
			if (temp == sum) {
				System.out.println(sum);
			}
			
			start++;
		} while (start <=end);

	}

}
