package com.kn.pattrenspractice;

public class NumberPyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				for (int m = 0; m <1; m++) {
					System.out.print(" ");
				}
				if (i + j >= 5 & j - i <= 3) {
					System.out.print(i);
				}

			}
			System.out.println();
		}
	}

}
