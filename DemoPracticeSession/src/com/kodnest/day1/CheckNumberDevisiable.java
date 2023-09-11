package com.kodnest.day1;

public class CheckNumberDevisiable {

	// Method checking divisible or not
	public void isDivisible(int num) {
		if ((num % 4 == 0) & (num % 16 == 0))
			System.out.println("Divisible");
		else
			System.out.println("Not Divisible");
	}

}
