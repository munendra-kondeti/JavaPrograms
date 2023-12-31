package com.kn.romannumbers;

public class RomenNUmber {

	// Method returns the Roman number by taking int as input
	public void printRomanNumber(int inputNumber) {
		// Roman number references 
		String[] charsForRoman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] numbersForRoman = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		// For storing the Roman number
		StringBuffer romanNumber = new StringBuffer();
		// traversing array
		var index = 0;
		while(index < numbersForRoman.length) {
			while(inputNumber >= numbersForRoman[index]) {
				inputNumber -= numbersForRoman[index];
				romanNumber.append(charsForRoman[index]);
			}
			index++;
		}
		
		// Print the Roman number
		System.out.println(romanNumber);
	}

}
