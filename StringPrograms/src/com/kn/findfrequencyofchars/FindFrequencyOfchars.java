package com.kn.findfrequencyofchars;

public class FindFrequencyOfchars {

	// Find the frequency of the chars
	void frequencyOfChars(String string) {
		char[] sortedStringChar = sortStirng(string).toCharArray();
		byte counter = 1;
		for (byte i = 0; i < sortedStringChar.length - 1; i++) {

			if (sortedStringChar[i] == sortedStringChar[i + 1]) {
				counter++;
			}

			else {
				System.out.println("count for " + sortedStringChar[i] + " = " + counter);
				counter = 1;
			}
			if (i == sortedStringChar.length - 2) {
				System.out.println("count for " + sortedStringChar[i] + " = " + counter);
			}

		}
	}

	// Sort the String
	String sortStirng(String string) {
		var stringChars = string.toCharArray();
		for (int i = 0; i < stringChars.length; i++) {
			for (int j = 0; j < stringChars.length - i - 1; j++) {
				if (stringChars[j] > stringChars[j + 1]) {
					var temp = stringChars[j];
					stringChars[j] = stringChars[j + 1];
					stringChars[j + 1] = temp;
				}

			}
		}
		return new String(stringChars);
	}
}
