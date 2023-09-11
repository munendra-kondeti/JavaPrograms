package java_class_tasks;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number for cube:");
		int number = scan.nextInt();
		scan.close();
		int cubedNumber = cubeeNumber(number);
		System.out.println("Cuber of the given number = "+ cubedNumber);
	}

	static int cubeeNumber(int number) {
		return number*number*number;
	}

}
