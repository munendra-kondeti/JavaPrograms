import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for factorial ");
		int num = scan.nextInt();
		int factorial = 1;
		for (int i = 1; i <=num;i++) {
			factorial *=i;
		}
		System.out.println(factorial);
		
	}

}
