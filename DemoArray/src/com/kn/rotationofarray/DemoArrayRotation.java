package com.kn.rotationofarray;

import java.util.Scanner;

public class DemoArrayRotation {

	public static void main(String[] args) {
		// Array declaration,creation and initialization
		int[] arr = { 1, 2, 3, 4, 5 };

		// Create Array rotation object
		ArrayRotationLeftSide arrayRotation = new ArrayRotationLeftSide();
		// taking input from the user for no. of rotations
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rotations you need to do");

		// calling rotation method with the reference object
		int rotatedArray[] = arrayRotation.arrayRotationLeftSide(arr, scanner.nextInt());
		// Traversing
		for (int ele : rotatedArray)
			System.out.print(ele);
		// Release resources
		scanner.close();
	}

}
