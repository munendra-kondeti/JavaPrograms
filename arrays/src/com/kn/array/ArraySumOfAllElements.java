package com.kn.array;

import java.util.Scanner;

public class ArraySumOfAllElements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr size ");
		int[] arr = new int[scan.nextInt()];
		
		// Initializing 
		for(int i =0;i< arr.length;i++){
			System.out.print("Enter element value for "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		
		
		int sum =0;
		// sum of all 
		for(int i =0; i< arr.length ; i++) {
			sum +=arr[i];
		}
		System.out.println(sum);
	}
}
