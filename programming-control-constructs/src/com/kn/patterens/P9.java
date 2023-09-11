package com.kn.patterens;

public class P9 {

	public static void main(String[] args) {
		// first part
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j - i <= 3 && i + j >= 5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		//second part
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j - i >= 1 && i + j <= 7)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
