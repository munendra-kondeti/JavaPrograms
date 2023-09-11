package com.kodnest.day1;

public class Session {

	public static void main(String[] args) {
		int a=0, b=0;
		double k = 42.47;
		long l = (long) 42.47;
		System.out.println(a);
		System.out.println(b + k);
		System.out.println(b++);
		System.out.println(++a);
		a= a++ + ++a + a++;
		b=a;
		System.out.println(b);
	}

}
