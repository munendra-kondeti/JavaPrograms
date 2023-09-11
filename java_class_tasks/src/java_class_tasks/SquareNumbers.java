package java_class_tasks;

import java.util.Scanner;

public class SquareNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number: ");
		int yourNumber = scan.nextInt();
		scan.close();
		int squireaNumbers=squireNumber(yourNumber);
		System.out.println("squareNumber("+yourNumber+") ==>>> "+squireaNumbers);
	}
	static int squireNumber(int yourNumber) {
		return yourNumber*yourNumber;
	}

}
