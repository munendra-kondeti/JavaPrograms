package com.kn.whileloop;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int num = scan.nextInt();
		scan.close();
		System.out.println(findLargestDigit(num));
		
		
	}

	static int findLargestDigit(int num) {
		int largestDigit = 0;
		while ( num > 0) {
			int r = num%10;
			if (r >largestDigit){
					largestDigit = r;
				}
			num /= 10;
			
		}
		return largestDigit;
	}

}
