package com.kn.upperletteroffirstword;

public class FirstLetterUpper {
	// method take input as string and makes every starting letter upper
	String makeFirstLetterUpper(String string) {
		String[] arrayString = string.split(" ");
		StringBuffer stringBuffer = new StringBuffer();
		for (String words : arrayString) {
			char[] charWords = words.toCharArray();
			if (charWords[0] >= 97 && charWords[0] <= 122) {
				charWords[0] = (char) (charWords[0] - 32);
			}
			
			String wordsOutput = new String(charWords);
			stringBuffer.append(wordsOutput);
			stringBuffer.append(" ");
		}
		return stringBuffer.toString();

	}
}
