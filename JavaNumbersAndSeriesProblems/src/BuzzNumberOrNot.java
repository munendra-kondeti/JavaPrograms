
public class BuzzNumberOrNot {

	public static void main(String[] args) {
		int num = 63;
		if (num % 7 == 0 || num % 10 == 7)
			System.out.println("Buzz Number");
		else System.out.println("Not a Buzz Number :(");
	}

}
