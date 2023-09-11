package com.kn.dowhile;

import java.util.Scanner;

public class CalculateAverageOfNNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for n numbers average ");
		int n = scan.nextInt();
		double calAveage = calculateAverage(n);
		scan.close();
		System.out.println(calAveage);
	}

	public static double calculateAverage(int n) {
		double i = 0;
		double sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= n);
		return (sum / n);
	}
}
