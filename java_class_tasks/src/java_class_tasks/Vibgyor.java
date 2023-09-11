package java_class_tasks;

import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give a Alphabit");
		switch (scan.next().charAt(0)) {
		case 'v':
			System.out.println("Vilate color");
			break;
		case 'V':
			System.out.println("Vilate color");
			break;
		case 'i':
		case 'I':
			System.out.println("indigo color");
			break;
		case 'b':
		case 'B':
			System.out.println("blue color");
			break;
		case 'g':
		case 'G':
			System.out.println("green color");
			break;
		case 'y':
		case 'Y':
			System.out.println("Yellow color");
			break;
		case 'o':
		case 'O':
			System.out.println("Orange color");
			
		case 'r':
		case 'R':
			System.out.println("Red color");
			break;
		default:
			System.out.println("invalid input");
			scan.close();
		}
		System.out.println("--> The End <--");
	}

}
