package com.kn.longestwordinstring;

public class LongestWordInString {

	// Method by taking the string and return the length
	void longestWord(String string) {
		String[] srr = string.split(" ");
		int minLength = 0;
		int index = 0;
		for (int i = 0; i < srr.length; i++) {
			if (minLength <= srr[i].length()) {
				minLength = srr[i].length();
				index = i;
			}
		}
		System.out.println(srr[index]);
	}
}
