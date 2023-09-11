package com.kodnest.day1;

import java.util.Scanner;

public class CheckDevisibleDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number you want to check that divisible by 4:-");
		int num = scanner.nextInt();
		scanner.close();
		// Creating Object and checking condition
		CheckNumberDevisiable checkNumberDevisiable = new CheckNumberDevisiable();
		checkNumberDevisiable.isDivisible(num);
	}

}
