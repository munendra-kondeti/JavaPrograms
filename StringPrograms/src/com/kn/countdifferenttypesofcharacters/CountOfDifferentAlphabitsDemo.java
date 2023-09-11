package com.kn.countdifferenttypesofcharacters;

public class CountOfDifferentAlphabitsDemo {

	public static void main(String[] args) {
		// input data
		String string = "i am learning java @12";
		// Creating objects
		CountDifferentCharactersInGivenString charactersInGivenString = new CountDifferentCharactersInGivenString();

		charactersInGivenString.count(string);
	}

}
