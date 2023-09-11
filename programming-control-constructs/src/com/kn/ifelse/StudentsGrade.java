package com.kn.ifelse;

import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student grade:- ");
		int grade = scan.nextInt();
		scan.close();
		boolean flage = isPass(grade);
		if (flage)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}

	private static boolean isPass(int grade) {
		if (grade > 50)
			return true;

		return false;
	}

}
