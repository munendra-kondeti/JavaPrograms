package com.kn.palandromofstring;

import java.util.Scanner;

public class PalandromOfStringDemo {

	public static void main(String[] args) {
		// User input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check weather its palandrom or not :- ");
		String string = scanner.nextLine();
		// Create objects
		PalandromOfString palandromOfString = new  PalandromOfString();
		// Call methods
		var flag = palandromOfString.isPalandrom(string);
		
		// print 
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
		// Release resources
		scanner.close();
	}

}
