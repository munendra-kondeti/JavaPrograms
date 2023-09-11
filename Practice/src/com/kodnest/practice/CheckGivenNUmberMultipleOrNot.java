package com.kodnest.practice;

public class CheckGivenNUmberMultipleOrNot {

	public static void main(String[] args) {
		int num = 20;
		if(isMultiple(num))
			System.out.println("Yes");
		else
			System.out.println("Not");
		
		
	}

	private static boolean isMultiple(int num) {
		if(num % 3 == 0 & num%5 == 0)
			return true;
		
		return false;
	}

}
