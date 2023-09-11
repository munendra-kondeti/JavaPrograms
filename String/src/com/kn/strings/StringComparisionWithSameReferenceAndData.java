package com.kn.strings;

public class StringComparisionWithSameReferenceAndData {

	public static void main(String[] args) {
		String s3 = "Ram";
		String s4 = s3;

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
