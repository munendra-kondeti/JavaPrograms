package com.kn.patterens;

public class P8 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j>=i; j--) {
//				if (j>=i) j>=1
					System.out.print((char)(64+i));
//				else
//					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
