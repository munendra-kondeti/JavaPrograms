package com.kn.forloop;

import java.util.Scanner;

public class TablesOfNumbers {

	public static void main(String[] args) {
		System.out.print("Enetr a number : - ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		printTables(num);
	}

	static void printTables(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

}
