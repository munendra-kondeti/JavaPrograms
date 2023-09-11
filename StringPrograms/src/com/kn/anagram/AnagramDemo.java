package com.kn.anagram;

import java.util.Scanner;

public class AnagramDemo {
	public static void main(String[] args ) {
		// Input data
		String string1 = "race";
		String string2 = "care";
		//Scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string:- ");
		
		// Object 
		Anagram anagram =new Anagram();
		// Call method is anagram
		boolean outPut = anagram.isAnagram(string1, string2);
		 System.out.println(outPut);
	}
}
