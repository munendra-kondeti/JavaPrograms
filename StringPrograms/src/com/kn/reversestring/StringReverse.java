package com.kn.reversestring;

public class StringReverse {
	// This method return the reverse string
	public String reverseString(String inputString) {
		char carr[] = inputString.toCharArray();
		StringBuffer reverseString = new StringBuffer();
		for (int i = 0; i < carr.length; i++) {
			reverseString = reverseString.append(carr[i]);
		}
		return reverseString.toString();
	}

}
