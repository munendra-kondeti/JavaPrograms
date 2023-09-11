package com.kn.patterens;

public class RightAngleTriangle {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
//				System.out.print(j);
				if(j-i>=0 && i+j<=6) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
