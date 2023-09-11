package com.kn.maintaingsapaceposition;

public class ReverseStringMainingSpacePosition {

	public String reverseString(String string) {
		StringBuffer stringBuffer = new StringBuffer();
		StringBuffer stringBuffer2 = new StringBuffer();

		for (int i = string.length() - 1; i >= 0; i--) {

			stringBuffer.append(string.charAt(i));
		}
		String str = stringBuffer.toString();
		for (int i = str.length() - 1; i >= 0; i++) {
			stringBuffer2.append(str.charAt(i));
		}

		return stringBuffer2.toString();
	}

}
