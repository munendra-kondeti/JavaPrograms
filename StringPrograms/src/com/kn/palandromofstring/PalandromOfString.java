package com.kn.palandromofstring;

public class PalandromOfString {
	
	// Method check the given string is palindrome or not
	public boolean isPalandrom(String string) {

		char[] stringToChars = string.toCharArray();
		StringBuffer reverseString = new StringBuffer();
		
		for(int i =stringToChars.length-1;i>=0;i--) {
			reverseString.append(stringToChars[i]);
		}
		if(string.equals(reverseString.toString()))
			return true;
		
		return false;
	}

}
