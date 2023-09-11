package com.kn.elseifladder;

import java.util.Scanner;

public class IdentifyCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character :- ");
		char character = scan.next().charAt(0);
		scan.close();
		identifyCharacters(character);
	}

	private static void identifyCharacters(char character) {
		/*
		 * lower-case vowel upper-case vowel, lower-case consonant, upper-case
		 * consonant, digit, special character
		 */
		if ((character >= 97 && character <= 122) || (character >= 65 && character <= 90)) {
			if (character == 'a' || character == 'e' | character == 'i' | character == 'o' | character == 'u') {
				System.out.println("Lower-case vowel");
			} else if (character == 'A' | character == 'E' | character == 'I' | character == 'O' | character == 'U') {
				System.out.println("Upper-case vowel");
			} else if ((character >= 97 && character <= 122)) {
				System.out.println("lower-case consonant");
			} else
				System.out.println("upper-case consonant");
		} else if (character >= 48 & character <= 57)
			System.out.println("Digits");
		else
			System.out.println("Special Character");
	}
}
