import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number for factors ");
		int num = scan.nextInt();
		scan.close();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println(i);
		}
	}

}
