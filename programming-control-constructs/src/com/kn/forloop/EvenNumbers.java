package com.kn.forloop;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number");
		int num = scan.nextInt();
		scan.close();
		for (int i = 1; i<=num;i++ ){
				if(isEven(i))
					System.out.println(i);
			}
	}

	static boolean isEven(int num) {
		if (num % 2 == 0)
			return true;

		return false;
	}

}
