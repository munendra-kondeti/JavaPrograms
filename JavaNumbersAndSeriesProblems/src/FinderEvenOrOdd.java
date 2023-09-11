import java.util.Scanner;

public class FinderEvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Eneter a number:- ");
		int num = scan.nextInt();
		scan.close();
		if (num%2==0) System.out.println("Even number");
		else System.out.println("Odd number");
	}

}
