package com.kodnest.day2.controlconstructors;

public class DemoDoWhile {

	public static void main(String[] args) {
		int num = 1;
		// do while
		do {
			System.out.println("In do while" + num);
			if (num == 10)
				break;
			num++;
		} while (num > 1);

	}

}
