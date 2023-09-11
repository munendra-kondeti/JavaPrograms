package com.kn.patterens;

public class Patteren1 {

	public static void main(String[] args) {
		int num = 65;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i + j >= 6 && j - i <= 4) {
					System.out.print((char) (num));
				} else {
					System.out.print(" ");
				}
			}
			num++;
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 9; j++) {
				if (i + j >= 6 && j - i <= 4) {
					System.out.print((char) num);
				} else {
					System.out.print(" ");
				}
			}
			num++;
			System.out.println();
		}
	}

}
