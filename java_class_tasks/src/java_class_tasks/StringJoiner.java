package java_class_tasks;

import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name ");
		String firstName = scan.nextLine();
		System.out.println("Enter your midel name");
		String midelName = scan.nextLine();
		System.out.println("Enter your last name");
		String lastName = scan.nextLine();
		scan.close();
		String fullName=joinString(firstName,midelName,lastName);
		System.out.println("The result of concatenating your full name " +fullName);
	}
	static String joinString(String firstName,String midelName,String lastName) {
		return firstName+" "+midelName+" "+lastName;
	}
}
