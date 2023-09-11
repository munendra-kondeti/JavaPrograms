package com.kodnest.practice;

public class Anagram {

	public static void main(String[] args) {
		String string1 = "1232", string2 = "3221";
		if (isAnagram(string1, string2))
			System.out.println("anagram");
		else
			System.out.println("Not anagram");
	}

	static boolean isAnagram(String firstString, String secondString) {
		if (sort(firstString).equals(sort(secondString)))
			return true;

		return false;
	}

	private static String sort(String string) {
		char[] crr = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			int temp = string.indexOf(i);
			for(int j = 1; i <)
		}
		String str = new String(crr);
		return str;
	}

}
