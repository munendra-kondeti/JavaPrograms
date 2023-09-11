package com.kn.patterens;

public class Patteren3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j >= 6 && j - i <= 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int j = 4; j >= 1; j--) {
				if (i + j >= 6 && j - i <= 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i + j >= 6 && j - i <= 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			for (int j = 4; j >= 1; j--) {
				if (i + j >= 6 && j - i <= 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
