package com.kn.patterens;

public class Pattern5 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if((i+j>=6)&&(i+j)<=14&&(i-j)<=4&&(j-i)<=4) {
					System.out.print((char)(64+i));
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
