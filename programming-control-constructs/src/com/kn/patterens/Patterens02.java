package com.kn.patterens;

public class Patterens02 {

	public static void main(String[] args) {

		int k = 0, rT = 5, cL = 9;
		for (int i = 1; i <= rT; i++) {
			k = i;
			for (int j = 1; j <= cL; j++) {
				if (j >= 6 - i && j <= 4 + i) {
					if((j <= 5)) k++;
					else k--;
					System.out.print(k-1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
