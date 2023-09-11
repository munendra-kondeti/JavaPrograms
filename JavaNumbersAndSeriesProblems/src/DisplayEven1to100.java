import java.util.Scanner;

public class DisplayEven1to100 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Even numbers from 1 to 100s ");
		int num = 100;
		for (int i = 0; i % 2 == 0; i += 2) {
			if (i == num)
				break;
			System.out.println(i);

		}

	}

}
