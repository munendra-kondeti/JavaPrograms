package com.kn.forloop;

import java.util.Scanner;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
		System.out.println("Enetr a number : - ");
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		scan.close();
		System.out.println(sumOfNnumber(n));
		
	}

	static int sumOfNnumber(int n) {
		int sum = 0;
		for (int i = 1 ; i<=n;i++) {
			sum += i;
		}
		return sum;
	}

}
