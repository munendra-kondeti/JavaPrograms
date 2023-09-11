package com.kn.reversestringwithspaces;

import java.util.Scanner;

public class ReverseStringReserverSpaceDemo {

	public static void main(String[] args) {
		// input data
//		String string = "i am learning java";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :- ");
		String string = scanner.nextLine();
		
		// Create object
		ReverseStringReserverSpace reserverSpace = new ReverseStringReserverSpace();
		
		// call method 
		String afterReverse = reserverSpace.reverseStringWithReserverSpace(string);
		// printing 
		System.out.println("Original String >>\n"+string);
		System.out.println();
		System.out.println("After reverse with reserve space >>\n"+afterReverse);
		
		// Release resources
		scanner.close();
		
	}

}
