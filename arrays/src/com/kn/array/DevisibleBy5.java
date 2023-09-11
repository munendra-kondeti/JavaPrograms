package com.kn.array;

import java.util.Scanner;

public class DevisibleBy5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr size ");
		int[] arr = new int[scan.nextInt()];
		
		// Initializing 
		for(int i =0;i< arr.length;i++){
			System.out.print("Enter element value for "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		
		
		
		// sum of all 
		for(int i =0; i< arr.length ; i++) {
			if(arr[i] % 5== 0)
				System.out.println(arr[i]);
		}
	}
}
