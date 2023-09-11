import java.util.Scanner;

public class FindNumerPositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enetr a number:- ");
		int number = scan.nextInt();
		scan.close();
		if (number == 0) {
			System.out.println("Either +ve nor -ve");
		} else if (number > 0) {
			System.out.println("Positive number :)");
		} else {
			System.out.println("Negitive number:(");
		}

	}

}
