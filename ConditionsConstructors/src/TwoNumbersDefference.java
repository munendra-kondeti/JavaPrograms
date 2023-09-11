import java.util.Scanner;

public class TwoNumbersDefference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a and b value");
		int a = scan.nextInt();
		int b =scan.nextInt();
		
		if (a>b) System.out.println("your value "+ (a-b));
		else {
			System.out.println("your value "+(b-a));
		}
	}

}
