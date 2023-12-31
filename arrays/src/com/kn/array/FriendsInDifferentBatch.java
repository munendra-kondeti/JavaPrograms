package com.kn.array;

import java.util.Scanner;

public class FriendsInDifferentBatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration in 2D
		String[][] batchs;
		// Array Creation and base value
		System.out.println("Enetr number of batches ");
		int batchSize = scan.nextInt();
		batchs = new String[batchSize][];

		// Array initilizing method
		batchInitilizing(batchs);
		printBatchDetails(batchs);
	}
	// printing the array
	private static void printBatchDetails(String[][] batchs) {
		for(int i =0; i< batchs.length;i++) {
			System.out.println("Your friends in A"+(i+1));
			for(int j = 0; j< batchs[i].length;j++) {
				System.out.println(batchs[i][j]);
			}
			System.out.println();
		}
	}

	// Batch details are initilizing in this method.
	static void batchInitilizing(String[][] batch) {
		// Creating scanner object
		Scanner scan = new Scanner(System.in);
		// Asking the number of friends there in a batch
		for (int i = 0; i < batch.length; i++) {
			System.out.println("Enter A" + (i + 1)+" Batch Total Friends");
			batch[i] = new String[scan.nextInt()];
		}
		// Asking the batch details
		for (int i = 0; i < batch.length; i++) {
			System.out.println("Enter batch A" + (i + 1) + " details");
			for (int friend = 0; friend < batch[i].length; friend++) {
				System.out.print("Enter the name of the person "+(friend+1));
				batch[i][friend] = scan.next();
			}
			System.out.println();
		}

	}

}
