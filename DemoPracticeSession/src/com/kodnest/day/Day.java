package com.kodnest.day;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter b");
		byte b = scanner.nextByte(); // 1 byte -128 to 127
		System.out.println("Enter s");
		short s = scanner.nextShort(); // 2 bytes -32768 to 32767
		System.out.println("Enter int");
		int a = scanner.nextInt(); // 4 bytes -2147483648 to 2147483647
		System.out.println("Enter l");
		long l = scanner.nextLong(); // 8 bytes
		System.out.println("Enter f");
		float f = scanner.nextFloat(); // 4 bytes
		System.out.println("Enter d");
		double d = scanner.nextDouble(); // 8 bytes
		System.out.println("Enter c");
		char c = scanner.next().charAt(0); // 2 byte
		System.out.println("Enter boolean");
		boolean bo = scanner.nextBoolean(); // 1 byte true or false
		System.out.println("Byte = " + b + " short= " + s + " int = " + a + " long = " + l + " float = " + f
				+ " double = " + d + " c= " + c + " boolean = " + bo);
		l = b + s;
		a = (int) l;
		System.out.println(a);

	}

}
