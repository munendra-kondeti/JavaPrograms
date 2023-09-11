import java.util.Scanner;

public class DisplayOdd1to100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Odd numbers from 1 to 100's");
		for (int i = 1; i % 2 != 0; i += 2) {
			if (i >= 100)
				break;
			System.out.println(i);
		}
		System.out.println("The end ");
	}

}
