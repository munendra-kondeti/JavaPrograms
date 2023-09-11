package com.kn.anagram;

public class Anagram {
	// Method for checking the given 2 strings are anagram or not
	boolean isAnagram(String string1, String string2) {
		char[] string1Chars = string1.toCharArray();
		char[] string2Chars = string2.toCharArray();
		if (string1.length() == string2.length()) {
			return sortedChars(string1Chars).equals(sortedChars(string2Chars));
		}
		
		return false;
	}
	// Return sorted array
	public char[] sortedChars(char[] stringChars) {
		for (int i = 0; i < stringChars.length - 1; i++) {
			char temp1 = stringChars[i];
			if (temp1 > stringChars[i + 1]) {
				stringChars[i] = stringChars[i + 1];
				stringChars[i + 1] = temp1;
			}
		}
		return stringChars;
	}

}
