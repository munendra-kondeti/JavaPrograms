package com.kn.romannumbers;

import java.util.Scanner;

public class RomenNUmberDemo {

	public static void main(String[] args) {

		// User input 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for finding the roman number:- ");
		var inputNumber = scanner.nextInt();
		
		// Create the object
		RomenNUmber nUmber = new RomenNUmber();
		
		// call the method print roman numbers
		nUmber.printRomanNumber(inputNumber);
		
		// release resources
		scanner.close();
	}

}
