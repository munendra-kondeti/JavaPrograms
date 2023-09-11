package com.kodnest.day1;

public class Session2 {

	public static void main(String[] args) {
		int a = 20;
		byte b =(byte) a;
		a = a + b;
		b =(byte) ((byte) (b++) + (a * a) + (a / b) + (b % a));
		System.out.println(b);
		long l = b;
		byte m=0;
		byte e =  m;
	}

}
