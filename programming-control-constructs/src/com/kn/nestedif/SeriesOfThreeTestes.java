package com.kn.nestedif;

import java.util.Scanner;

public class SeriesOfThreeTestes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 3 testes score :- ");
		int test1 = scan.nextInt();
		int test2 = scan.nextInt();
		int test3 = scan.nextInt();
		scan.close();

		printStudentAverage(test1, test2, test3);
	}

	static void printStudentAverage(int test1, int test2, int test3) {
		int pass = 30;
		if (test1 >= pass & test2 >= pass & test3 >= pass) {
			int total = test1 + test2 + test3;
			int averagTotal = total / 3;
			if (averagTotal >= total) {
				System.out.println("Score more then the average " + total);
			}else 
				System.out.println("Score not more than the verage");
		} else {
			System.out.println("Better luck next time ");
		}

	}

}
