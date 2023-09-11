import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a number for Fibanocci :- ");
		int num = scan.nextInt();
		scan.close();
		int firstNumber=0,secondNumber=1, nextNumber = 0;
		System.out.print(firstNumber+" "+secondNumber);
		for (int i = 3;i<=num;i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.print(" "+nextNumber);
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
		
	}

}
