package com.kn.countofall;

import java.util.Scanner;

public class StingAllCharactersCountDemo {

	public static void main(String[] args) {
		
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.nextLine();
		
		// create object 
		StingAllCharactersCount allCharactersCount = new StingAllCharactersCount();
		// calling method
		allCharactersCount.allCharactersCount(string);
		
		// release the resources
		scanner.close();
		
	}

}
