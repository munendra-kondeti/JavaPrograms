package com.kn.convertuppertolowervise;

public class ConvertUpperToLowerAndLowerToUpper {

	// Method ConvertUpperToLowerAndLowerToUpper
	public String convertUpperToLowerAndLowerToUpper(String string) {
		StringBuffer stringBuffer = new StringBuffer();
		String[] stringArray = string.split(" ");

		for (String word : stringArray) {
			char[] wordIntoChar = word.toCharArray();
			for (int index = 0; index < wordIntoChar.length; index++) {
				if (wordIntoChar[index] >= 97 && wordIntoChar[index] <= 122) {
					wordIntoChar[index] = (char) (wordIntoChar[index] - 32);
				} else if (wordIntoChar[index] >= 65 && wordIntoChar[index] <= 90) {
					wordIntoChar[index] = (char) (wordIntoChar[index] + 32);
				}
			}
			stringBuffer.append(wordIntoChar);
			stringBuffer.append(" ");
		}
		// With the toString method and trim we are get exactly the output 
		return stringBuffer.toString().trim();
	}
}
