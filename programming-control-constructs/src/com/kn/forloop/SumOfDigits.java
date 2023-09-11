package com.kn.forloop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for sum of its degits :- ");
		int num = scan.nextInt();
		scan.close();
	int sum =sumOfNumber(num);
		System.out.println(sum);
	}

	static int sumOfNumber(int num) {
		int sum = 0;
		for (;num>0;) {
			int r = num % 10 ;
			sum += r;
			num /=10;
		}
		return sum;
	}

}
