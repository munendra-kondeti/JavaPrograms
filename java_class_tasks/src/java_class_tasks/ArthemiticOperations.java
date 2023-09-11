package java_class_tasks;

import java.util.Scanner;

public class ArthemiticOperations {

	public static void main(String[] args) {
		CalculatorApp cal = new CalculatorApp(take_input("a"), take_input("b"));
		cal.printOut("Addition", cal.addition());
		cal.printOut("Sub", cal.sub());
		cal.printOut("Mult", cal.multplication());
		cal.printOut("Devision", cal.devision());
		cal.printOut("Modular", cal.modular());
	}

	static int take_input(String s) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter "+s+" value for do arthemitic operations, Note:- a>b = ");
		return scan.nextInt();
	}

}
