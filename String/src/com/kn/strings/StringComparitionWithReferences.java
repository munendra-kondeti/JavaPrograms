package com.kn.strings;

public class StringComparitionWithReferences {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = s1 + s2;
		String s4 = s1 + s2;

		if (s3 == s4)
			System.out.println("Same reference");
		else
			System.out.println("Different reference");
		if (s3.equals(s4))
			System.out.println("Same data");
		else
			System.out.println("Different data");
	}

}
