package com.kn.elseifladder;

import java.util.Scanner;

public class CategorizesPeople {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :- ");
		int age = scan.nextInt();
		scan.close();
		categorizesPeopleBasedOnAge(age);
	}
	
	private static void categorizesPeopleBasedOnAge(int age) {
		if (age >= 0 && age <= 12)
			System.out.println("Child");
		else if (age >= 13 && age <= 19)
			System.out.println("Teen");
		else if (age >= 20 && age <= 59)
			System.out.println("Adult");
		else if (age >= 60)
			System.out.println("Senior");
	}

}
