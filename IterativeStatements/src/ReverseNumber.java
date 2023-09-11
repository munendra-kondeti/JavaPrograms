import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number :- ");
		int num = scan.nextInt();
		System.out.print("Your reverse number :- ");
		int r;
		while (num>0) {
			r = num % 10;
			System.out.print(r);
			num/=10;
		}
	}

}
