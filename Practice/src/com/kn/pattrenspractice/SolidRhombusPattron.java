package com.kn.pattrenspractice;

public class SolidRhombusPattron {

	public static void main(String[] args) {

		for (int i = 4; i >= 0; i--) {
			
			for (int j = 0; j < 9; j++) {
				if (j-i >=0 && j-i <= 4) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
