package com.kodnest.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// Creating scanner object
		Scanner scanner = new Scanner(System.in);

		// Addition with byte and short
		System.out.println("Enter the byte value :- ");
		byte addOperend1 = scanner.nextByte();

		System.out.println("Enter the short value :- ");
		short addOperend2 = scanner.nextShort();

		System.out.println(
				"Addition of byte " + addOperend1 + " and short " + addOperend2 + " = " + (addOperend1 + addOperend2));

		// Subtraction of long and int
		System.out.println("Enter the long value:- ");
		long subLong = scanner.nextLong();

		System.out.println("Enter the int value:- ");
		int subInt = scanner.nextInt();

		System.out.println("Subtraction of long " + subLong + " int " + subInt + " = " + (subLong - subInt));

		// Multiplication of float and byte
		System.out.println("Enter the float value:- ");
		float multFloat = scanner.nextFloat();

		System.out.println("Enter the int value:- ");
		byte multByte = scanner.nextByte();

		System.out.println("Subtraction of float " + multFloat + " byte " + multByte + " = " + (multByte * multFloat));

		// Devision of double and int
		System.out.println("Enter the double value:- ");
		double devDouble = scanner.nextDouble();

		System.out.println("Enter the int value:- ");
		int devInt = scanner.nextInt();

		System.out.println("Subtraction of Double " + devDouble + " int " + devInt + " = " + (devDouble / devInt));

	}

}
