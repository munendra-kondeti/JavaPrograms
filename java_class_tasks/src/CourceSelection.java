import java.util.Scanner;

public class CourceSelection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cgp = scan.nextInt();

		if (cgp >= 90) {
			System.out.println("Welcome to Artifical Master cource");

		} else if (cgp >= 75 && cgp < 90) {
			System.out.println("IoT");

		}
		else if (cgp == 60 && cgp <75) {
			System.out.println("Neural Network");
		}
		else if (cgp > 45 && cgp <60) {
			System.out.println("Quantam Computing");
		}
		else {
			System.out.println("IT job");
		}
	}

}
