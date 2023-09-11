package com.kn.whileloop;

import java.util.Scanner;

public class SquireRoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number for squire root ");
		int num = scan.nextInt();
		scan.close();
		findSuireRoot(num);
	}

	private static void findSuireRoot(int num) {
		int i = 0;
		while (i <= num) {
			if (i * i == num)
				System.out.println(i);
			i++;
		}

	}

}
