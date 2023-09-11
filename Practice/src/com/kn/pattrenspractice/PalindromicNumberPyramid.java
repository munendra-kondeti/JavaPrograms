package com.kn.pattrenspractice;

public class PalindromicNumberPyramid {

	public static void main(String[] args) {
		for (int i = 1, k = i; i <= 5; i++) {
			for (int j = 0; j < 9; j++) {
				if (j == 4)
					k = 1;
				System.out.print((i + j >= 5 && j - i <= 3) ? ((j >= 4) ? k++ : k--) : " ");
			}
			System.out.println();
		}
	}

}
