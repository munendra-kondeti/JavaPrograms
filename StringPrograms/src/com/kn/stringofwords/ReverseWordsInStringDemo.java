package com.kn.stringofwords;

public class ReverseWordsInStringDemo {

	public static void main(String[] args) {
		// input data
		String s1 = "i am learning java";
		
		// creating object
		ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
		
		// Split the given input string with the delimiter
		String[] srr = s1.split(" ");
		
		// reversing the words with the help of the reverse Words method.
		for(int i = 0; i <srr.length ; i++ ) {
			System.out.print(reverseWordsInString.reverseWords(srr[i]));
			System.out.print(" ");
		}
		
	}

}
