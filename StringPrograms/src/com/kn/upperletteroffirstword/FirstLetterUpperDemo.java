package com.kn.upperletteroffirstword;

public class FirstLetterUpperDemo {

	public static void main(String[] args) {
		// input data
		String inputString = "i love java";
		
		// Object creation 
		FirstLetterUpper firstLetterUpper = new FirstLetterUpper();
		// calling method
		System.out.println((firstLetterUpper.makeFirstLetterUpper(inputString)));
	}

}
