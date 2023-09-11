package com.kn.stringofwords;
public class ReverseWordsInString {

	String reverseWords(String string) {
		StringBuffer str = new StringBuffer();
		char crr[] = string.toCharArray();
		for (int i = crr.length - 1; i >= 0; i--) {
			str.append(crr[i]);
		}
		return str.toString();
	}

}
