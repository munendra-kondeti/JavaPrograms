package com.kn.strings;

public class StringComparision {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram" + "Sita";
		String s4 = "Ram" + "Sita";

		if (s3 == s4)
			System.out.println("Same reference");
		else
			System.out.println("Different reference");
		if (s3 == s4)
			System.out.println("Same data");
		else
			System.out.println("Different data");
	}

}
