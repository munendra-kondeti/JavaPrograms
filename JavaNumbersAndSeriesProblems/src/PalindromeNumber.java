
public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 48984;
		if (isPalindrome(num))
			System.out.println("Palindrome number :)");
		else
			System.out.println("Not a Palindrome number :(");
	}

	static boolean isPalindrome(int num) {
		int temp = 0;
		int inputnumber = num;
		while (num > 0) {
			int r = num % 10;
			temp = temp * 10 + r;
			num /= 10;
		}
		if (temp == inputnumber)
			return true;
		return false;
	}

}
