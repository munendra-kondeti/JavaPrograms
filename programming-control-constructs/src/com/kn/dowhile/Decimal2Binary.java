package com.kn.dowhile;

public class Decimal2Binary {

	public static void main(String[] args) {
		int num = 75;
		System.out.println(decimalToBinary(num));
	}

	static int decimalToBinary(int num) {
		int decimal = 0;
		int alter =0;
		while(num >0) {
			int r = num % 2;
			alter = alter * 10 +r;
			num/=2;
		}
		while (alter >0) {
			int r = alter % 10;
			decimal = decimal * 10 + r;
			alter /=10;
		}
		return decimal;
	}
}
