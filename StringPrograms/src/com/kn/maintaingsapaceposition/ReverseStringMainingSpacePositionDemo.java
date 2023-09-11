package com.kn.maintaingsapaceposition;

import java.util.Scanner;

public class ReverseStringMainingSpacePositionDemo {

	public static void main(String[] args) {
		// Take user input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr a string");
		String input = scanner.nextLine();

		// Create object ReverseStringMainingSpacePosition
		ReverseStringMainingSpacePosition reverseStringMainingSpacePosition = new ReverseStringMainingSpacePosition();

		// call method
		System.out.println(reverseStringMainingSpacePosition.reverseString(input));

		// Release the resources
		scanner.close();

	}
}
