package com.kn.ceasercipher;

public class CeaserCipherTextDemo {

	public static void main(String[] args) {
		// input data
		String inputString = "AbZ";
		int steps = 2;
		
		// Object Creation
		CeaserCipherText ceaserCipherText = new CeaserCipherText();
		
		// call method
		String outPut = ceaserCipherText.cipherText(inputString, steps);
		// print
		System.out.println(outPut);
	}

}
