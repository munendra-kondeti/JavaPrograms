package com.kn.countdifferenttypesofcharacters;

public class CountDifferentCharactersInGivenString {

	// This method returns number of vowels
	void count(String string) {
		String[] srr = string.split("");
		int vowels = 0, consonents = 0, specialChar = 0, digits = 0;
		for (int j = 0; j < srr.length; j++) {
			char[] crr = srr[j].toCharArray();
			for (int i = 0; i < crr.length; i++) {
				if (crr[i] >= 48 & crr[i] <= 57) {
					digits++;
				} else if (crr[i] >= 97 & crr[i] <= 122 | crr[i] >= 65 & crr[i] <= 90) {
					if (crr[i] == 'a' | crr[i] == 'e' | crr[i] == 'i' | crr[i] == 'o' | crr[i] == 'u' | crr[i] == 'U'
							| crr[i] == 'O' | crr[i] == 'I' | crr[i] == 'E' | crr[i] == 'A') {
						vowels++;
					} else {
						consonents++;

					}
				} else {
					specialChar++;
				}
			}
		}
		System.out.println("Vowels = " + vowels + "\nconsonents = " + consonents + "\nspecialChar = " + specialChar
				+ "\ndigits = " + digits);
	}
}
