package com.kn.patterens;

public class Pattren01 {

	public static void main(String[] args) {
		int k = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 7; j++) {
				if (j >= 5 - i && j <= 3 + i) {
					if (i % 2 != 0) {
						if (j % 2 == 0) {
							int o = (j <= 4) ? k++ : k--;
							System.out.print(k);
						} else
							System.out.print(" ");
					} else {
						int o = (j <= 4) ? k++ : k--;
						if (j % 2 != 0) {
							System.out.print(k);
						} else
							System.out.print(" ");
					}
				} else {
					System.out.print(" ");
				}
			}
			k=0;
			System.out.println();
		}
	}

}
