import java.util.Scanner;

public class Dailer {

	public static void main(String[] args) {
		welcom();
		KeyPad myKeyPad = new KeyPad(inputNumber(), inputSim());
		System.out.println("Do you want to see your number press 1:- ");
		Scanner scan = new Scanner(System.in);
		if (scan.nextInt()==1) {
			doYouWantToSeeNumber(myKeyPad);
		}
		else {
			System.out.println("Thats nice bro");
		}
	}

	static void welcom() {
		System.out.println("Hello bro welcom to my dailer");
	}
	static int inputSim() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter SIM ; ");
		return scan.nextInt();

	}


	static int inputNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ; ");
		return scan.nextInt();

	}
	static void doYouWantToSeeNumber(KeyPad m){

		m.printMyNumber();
	}

}
