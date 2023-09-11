package java_class_tasks;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your name, age and rollno ");
		StudentDetails stud = new StudentDetails(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
		stud.printOut();
	}

}
