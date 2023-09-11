package com.kn.dowhile;

import java.util.Scanner;

public class CubeSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n number ");
		int n = scan.nextInt();
		scan.close();
		int cubSum = calCubSum(n);
		System.out.println(cubSum);
	}

	private static int calculateCubeSum(int n) {
		int cubeSum = 0;
		int i = 1;
		do {
			cubeSum += i * i * i;
			i++;
		} while (i <= n);
		return cubeSum;
	}
	
	static int calCubSum(int num) {
		int cubicSum = (num*(num+1)/2);
		return cubicSum * cubicSum;
	}

}
