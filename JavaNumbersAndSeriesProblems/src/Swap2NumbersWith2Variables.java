
public class Swap2NumbersWith2Variables {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 20;
		System.out.println("num 1 = " + num1 + " num 2 =" + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("num 1 = " + num1 + " num 2 =" + num2);
	}

}
