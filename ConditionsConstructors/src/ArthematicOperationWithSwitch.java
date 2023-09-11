import java.util.Scanner;

public class ArthematicOperationWithSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give below operations - , *, / ,% ");
		char c = scanner.next().charAt(0);
		if (valid(c)) {
			int num1 = input();
			int num2 = input();
			switch (c) {
			case '-':

				System.out.println("The result of substraction " + num2 + " from " + num1 + " Substraction nuymber "
						+ subtractNumbers(num1, num2));
				break;

			case '*':

				System.out.println(
						"The result of substraction " + num2 + " from " + num1 + "=" + multiplyNumbers(num1, num2));
				break;

			case '/':
				System.out.println(
						"The result of substraction " + num2 + " from " + num1 + "=" + divideNumbers(num1, num2));
				break;

			case '%':
				System.out.println(
						"The result of substraction " + num2 + " from " + num1 + "=" + findRemainder(num1, num2));
				break;

			}
			System.out.println("The End");
		} else
			System.out.println("Not a valid");
	}

	static boolean valid(char character) {
		if (character == '+' || character == '-' || character == '*' || character == '/')
			return true;

		return false;
	}

	static int subtractNumbers(int num1, int num2) {
		return num1 - num2;
	}

	static int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}

	static double divideNumbers(int num1, int num2) {
		return num1 / num2;
	}

	static int findRemainder(int num1, int num2) {
		return num1 % num2;
	}

	static int input() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		return a;

	}

}
