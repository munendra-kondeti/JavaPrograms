package com.kn.reversestringwithspaces;

public class ReverseStringReserverSpace {

	// Method return the string by reversing the string with reserver space
	String reverseStringWithReserverSpace(String string) {
		char[] stringOfChars = string.toCharArray();
		char[] reverseOfCharsWithSpace = new char[stringOfChars.length];
		for (int i = 0; i < stringOfChars.length; i++) {
			if (isSpace(stringOfChars[i])) {
				reverseOfCharsWithSpace[i] = ' ';
			}
		}
		for (int i = stringOfChars.length - 1, j = 0; i >= 0; i--, j++) {
			// picker based on space
			if (isSpace(stringOfChars[i])) {
				i--;
				// Setter
				if (isSpace(reverseOfCharsWithSpace[j])) {
					j++; 
					reverseOfCharsWithSpace[j] = stringOfChars[i];
				}else {
					reverseOfCharsWithSpace[j] = stringOfChars[i];
				}
			} else {
				// Setter
				if (isSpace(reverseOfCharsWithSpace[j])) {
					j++;
					reverseOfCharsWithSpace[j] = stringOfChars[i];
				}else {
					reverseOfCharsWithSpace[j] = stringOfChars[i];					
				}
			}
		}
		return new String(reverseOfCharsWithSpace);
	}

	private boolean isSpace(char c) {
		if (c == ' ')
			return true;

		return false;
	}
}
