package com.kn.ceasercipher;

public class CeaserCipherText {
	// Method returns the cipher text
	String cipherText(String string, int steps) {

		char[] stringChars = string.toCharArray();
		for (int i = 0; i < stringChars.length; i++) {
			char temp = (char) (stringChars[i] + steps);
			if (isLower(stringChars[i]) & (temp >= 'z')) {
				stringChars[i] = (char) ((stringChars[i] - 26) + steps);
			} else if (isUpper(stringChars[i]) & (temp >= 'Z')) {
				stringChars[i] = (char) ((stringChars[i] - 26) + steps);
			} else {
				stringChars[i] = temp;
			}
		}

		return new String(stringChars);
	}

	// Checks whether lower letter not its take array of character and its index
	private boolean isLower(char stringChars) {
		return stringChars >= 'a' & stringChars <= 'z';
	}

	private boolean isUpper(char stringChar) {
		return stringChar >= 'A' & stringChar <= 'Z';
	}
}
