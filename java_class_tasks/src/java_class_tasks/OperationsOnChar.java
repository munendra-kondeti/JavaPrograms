package java_class_tasks;

import java.util.Scanner;

public class OperationsOnChar {

	public static void main(String[] args) {
		char yourOperation = welcome();
		if (validCheck(yourOperation)) {

			System.out.println("Enter 2 values for do the operation " + yourOperation);
			Scanner scan = new Scanner(System.in);
			ArthermaticOperators arthermaticOperators = new ArthermaticOperators(scan.nextInt(), scan.nextInt());
			scan.close();

			if (yourOperation == '+')
				arthermaticOperators.printOut(yourOperation, arthermaticOperators.add());
			if (yourOperation == '-')
				arthermaticOperators.printOut(yourOperation, arthermaticOperators.sub());
			if (yourOperation == '*')
				arthermaticOperators.printOut(yourOperation, arthermaticOperators.mult());
			if (yourOperation == '/')
				arthermaticOperators.printOut(yourOperation, arthermaticOperators.dev());

		} else {
			System.out.println("Select a valid Operation");
		}
	}
	static char welcome() {
		System.out.println("Select your operation (+,-,*,/)" + "\n+ --> Addition" + "\n- --> Subtraction"
				+ "\n* --> Multiplication" + "\n/ --> Devision");

		Scanner scan = new Scanner(System.in);
		char yourOperation = scan.next().charAt(0);
		scan.close();
		return yourOperation;
	}

	static boolean validCheck(char character) {
		if (character == '+' || character == '-' || character == '*' || character == '/')
			return true;

		return false;
	}

}
