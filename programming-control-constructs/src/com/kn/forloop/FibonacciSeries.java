package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		System.out.print("Enetr a number : - ");
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		scan.close();
		int fibonacci = fibonacciSeries(num);
		System.out.println("your value "+fibonacci);
	}

	private static int fibonacciSeries(int num) {
		int fistNumber = 0, secondNumber = 1,nextNumber=0;
		
		for (int i =3 ; i<=num;i++) {
			nextNumber=fistNumber + secondNumber;
			fistNumber = secondNumber;
			secondNumber = nextNumber;
		}
		return nextNumber;
	}

}
