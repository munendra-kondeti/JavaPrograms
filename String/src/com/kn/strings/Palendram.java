package com.kn.strings;

public class Palendram {

	public static void main(String[] args) {
		String normalString = "mom";
		char normalStringArray[] = new char[normalString.length()];
		char reverseStringArray[] = new char[normalStringArray.length];
		for (int i = 0; i < normalStringArray.length; i++) {
			normalStringArray[i] = normalString.charAt(i);
		}
		for (int i = normalStringArray.length-1,j=0;i>=0; i--,j++) {
			reverseStringArray[j] = normalStringArray[i];
		}
		String reverse = new String(reverseStringArray);
		
		if(normalString.equals(reverse))
			System.out.println("Yes");
		
	}

}
