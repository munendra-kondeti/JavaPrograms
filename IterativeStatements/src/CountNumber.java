import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enetr a number :- ");
		int num = scan.nextInt();
		scan.close();
		int r, count = 0;
		for (; num > 0;) {
			r = num % 10;
			count++;
			num /= 10;
		}
		System.out.print(count);

	}

}
