
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 12321;
		int temp =num;
		while (num > 0) {
			int r = num % 10;
			System.out.print(r);
			num /= 10;
		}
		System.out.println();
		System.out.println(reverseNumber(temp));
	}

	static int reverseNumber(int num) {
		int c = 0;
		while (num > 0) {
			int r = num % 10;
			c = c * 10 + r;
			num /= 10;
		}
		return c;
	}
}
