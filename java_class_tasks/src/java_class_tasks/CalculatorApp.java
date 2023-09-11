package java_class_tasks;

import java.util.Scanner;

public class CalculatorApp {

	int a;
	int b;
	public CalculatorApp(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int addition() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int multplication() {
		return a * b;
	}

	double devision() {
		return a / b;
	}

	int modular() {
		return a % b;
	}
	
	void printOut(String operationName ,int input) {
		System.out.println("Your "+operationName+ " = "+input);
	}
	void printOut(String operationName ,double input) {
		System.out.println("Your "+operationName+ " = "+input);
	}
}
