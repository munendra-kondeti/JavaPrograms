package com.kn.countofall;

public class StingAllCharactersCount {

	// Characters count
	void allCharactersCount(String string) {

		char[] charactesInString = string.toCharArray();
		int upperCase = 0, upperCaseVowels = 0, upperCaseConsonants = 0, lowerCase = 0, lowerCaseVowels = 0,
				lowerCaseConsonts = 0, digits = 0, space = 0, specialChars = 0;
		for (var character : charactesInString) {
			if (isUpperCase(character)) {
				upperCase++;
				int upper = (isVowels(character) == 1) ? upperCaseVowels++ : upperCaseConsonants++;

			} else if (isLowerCase(character)) {
				lowerCase++;
				int lower = (isVowels(character) == 1) ? lowerCaseVowels++ : lowerCaseConsonts++;
			} else if (isDigit(character)==1) {
				digits+=isDigit(character);
			} else if (isSpace(character)==1) {
				space+=isSpace(character);
			} else {
				specialChars++;
			}
		}
		System.out.println("upper case >> " + upperCase + "\nupper case vowels >> " + upperCaseVowels
				+ "\nupper case consonants >> " + upperCaseConsonants + "\nlower cases >> " + lowerCase
				+ "\nlower case vowels >> " + lowerCaseVowels + "\nlower case consonants>> " + lowerCaseConsonts
				+ "\ndigits >> " + digits + "\nspace >> " + space + "\nspecial chars >> " + specialChars);
	}

	private byte isVowels(char character) {
		if (character == 'a' | character == 'e' | character == 'i' | character == 'o' | character == 'u'
				| character == 'U' | character == 'O' | character == 'I' | character == 'E' | character == 'A')
			return 1;
		return 0;
	}

	private byte isSpace(char character) {
		if (character == ' ')
			return 1;

		return 0;
	}

	private byte isDigit(char character) {
		if (character >= '0' & character <= '9')
			return 1;

		return 0;
	}

	private boolean isUpperCase(char character) {
		if (character >= 'A' & character <= 'Z')
			return true;

		return false;
	}

	private boolean isLowerCase(char character) {
		if (character >= 'a' & character <= 'z')
			return true;

		return false;
	}
}
