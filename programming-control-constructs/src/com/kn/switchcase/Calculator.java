package com.kn.switchcase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		simpleCalculator();
	}

	static void simpleCalculator() {
		System.out.println("What operation do you need to perform given below" + "\n +,-,*,/  --> ");
		
		char operation = input().next().charAt(0);
		switch (operation) {
		case '+' -> System.out.println(addition(input().nextInt(), input().nextInt()));
		case '-' -> System.out.println(sub(input().nextInt(), input().nextInt()));
		case '*' -> System.out.println(mult(input().nextInt(), input().nextInt()));
		case '/' -> System.out.println(dev(input().nextInt(), input().nextInt()));
		default -> System.out.println("Plz Select correct operation ");
		}
	}

	static int sub(int input, int input2) {
		return input - input2;
	}

	static int mult(int input, int input2) {
		return input * input2;
	}

	private static double dev(int input, int input2) {
		return input / input2;
	}

	static int addition(int a, int b) {
		return a + b;
	}

	private static Scanner input() {
		System.out.println("Enter a value ");
//		Scanner scan = ;
		return new Scanner(System.in);
		
	}

}
