package com.kn.reversestring;

import java.util.Scanner;

public class StringReverseDemo {

	public static void main(String[] args) {
		// Taking the input from the user with scanner
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name that you want to reverse");
		String inputString = scanner.nextLine();
		// Create a object
		StringReverse stringReverse = new StringReverse();
		// call the method for reversing
		String outputString = stringReverse.reverseString(inputString);
		// Print the output 
		System.out.println(outputString);
		// Close the resources
		scanner.close();
		
	}

}
