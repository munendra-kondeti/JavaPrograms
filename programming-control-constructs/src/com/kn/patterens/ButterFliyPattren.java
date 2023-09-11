package com.kn.patterens;

public class ButterFliyPattren {

	public static void main(String[] args) {
		int num = 9;
		int k = 0;
		for (int i = 1; i <= num; i++) {
			int o = (i <= 5) ? k++ : k--;
			for (int j = 1; j <= num; j++) {
				if (j <= k || j >= 10 - k) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
