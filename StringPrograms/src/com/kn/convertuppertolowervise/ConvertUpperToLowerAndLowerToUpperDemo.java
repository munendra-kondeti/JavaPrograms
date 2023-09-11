package com.kn.convertuppertolowervise;

import java.util.Scanner;

public class ConvertUpperToLowerAndLowerToUpperDemo {

	public static void main(String[] args) {
		// Taking the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String inputString = scanner.nextLine();

		// Create an object for ConvertUpperToLowerAndLowerToUpper

		ConvertUpperToLowerAndLowerToUpper convertUpperToLowerAndLowerToUpper = new ConvertUpperToLowerAndLowerToUpper();

		// Call the method ConvertUpperToLowerAndLowerToUpper
		String outputSting = convertUpperToLowerAndLowerToUpper.convertUpperToLowerAndLowerToUpper(inputString);
		
		// Printing the output
		System.out.println(outputSting);

		// Release the resources
		scanner.close();
	}

}
