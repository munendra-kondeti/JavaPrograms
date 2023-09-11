package com.kn.patterens;

public class Pattern1 {
	public static void main(String[] args) {
		int c = 1, n = 5;
		for (int i = 1; c < n; i++) {
			for (int j = 1; j <= i; j++) {
				if(c==6) {
					return;
				}
				else {
					System.out.print(c);
					++c;
				}
			}
			System.out.println();
		}
	}
}
