package com.kn.patterens;

public class Pattern4 {

	public static void main(String[] args) {
		// Top layer
		for (int i = 5; i>=1;i--) {
			for (int j =1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		// Bottom layer
		for (int i = 1; i<=5;i++) {
			for (int j =1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
