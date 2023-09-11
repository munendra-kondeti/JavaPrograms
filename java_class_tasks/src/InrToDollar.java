import java.util.Scanner;

public class InrToDollar {

	public static void main(String[] args) {
		// 1 doller in inr 82.77
		// 1 INR = 0.009485 pounds
		// 1 inr = 0.012 $
		Scanner scan = new Scanner(System.in);
		double inr = scan.nextDouble();
		System.out.printf("Inr to Doller $ %.2f ",intToDoller(inr));
		System.out.printf("\nint to pounds %.2f",inrToPounds(inr));
	}

	 static double inrToPounds(double inr) {
		// TODO Auto-generated method stub
		return inr*0.0095;
	}

	static double intToDoller(double inr) {
		return 0.0121*inr;
	}
	

}
