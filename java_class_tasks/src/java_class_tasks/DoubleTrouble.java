package java_class_tasks;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = scan.nextInt();
		scan.close();
		int doubledScore = doubleTheNumber(num);
		System.out.println(doubledScore);
				
	}

	static int doubleTheNumber(int num) {
		return num*2;
	}

}
