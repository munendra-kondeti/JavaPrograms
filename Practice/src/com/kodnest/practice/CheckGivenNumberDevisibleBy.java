package com.kodnest.practice;

public class CheckGivenNumberDevisibleBy {

	public static void main(String[] args) {
		int num = 30; // 60
		if (isDevisibleBy(num))
			System.out.println("Yes");
		else
			System.out.println("Not");
	}
	// method check divisible or not 
	static boolean isDevisibleBy(int num) {
		if (num % 2 == 0 & num % 3 == 0 & num % 4 == 0 & num % 5 == 0)
			return true;

		return false;
	}

}
