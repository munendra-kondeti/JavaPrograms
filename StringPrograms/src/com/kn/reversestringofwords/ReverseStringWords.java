package com.kn.reversestringofwords;

public class ReverseStringWords {
	// This Constructor prints the given string in reverse order
	ReverseStringWords(String string) {
		// Spilt the given string
		String[] srr = string.split(" ");
		for (int i = srr.length - 1; i >= 0; i--) {
			System.out.print(srr[i]);
			System.out.print(" ");
		}
	}
}
