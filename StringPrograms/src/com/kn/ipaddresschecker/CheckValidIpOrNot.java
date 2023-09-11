package com.kn.ipaddresschecker;

public class CheckValidIpOrNot {

	// valid ip or not
	boolean isValidIp(String string) {
		string = string.replace(".", " ");
		String[] strings = string.split(" ");
		// Here checking is it having 4 portions or not
		if (strings.length == 4) {
			for (int i = 0; i < strings.length; i++) {
				// Calling the stringToDigits method
				int dights = stringToDigits(strings[i]);
				// Checking the condition if the digits are in the give range or not
				if (dights >= 0 && dights <= 255) {
					// Here checking if we are in last portions then its valid
					if (strings.length - 1 == i) {
						return true;
					}
					// we are keep on checking until reach the last portions
					continue;

				}
				// if above condition not satisfied means its not valid
				else {
					return false;
				}

			}
		}
		// if condition not satisfied then its not valid ip
		return false;
	}

	// this method convert a string into a digits/digit
	public int stringToDigits(String strings) {
		char[] chars = strings.toCharArray();
		var charsToDights = 0;
		// With this for loop every character converted into digit;
		for (var i = 0; i < chars.length; i++) {

			int number = chars[i] - '0';
			charsToDights = charsToDights * 10 + number;
		}
		return charsToDights;
	}
}
