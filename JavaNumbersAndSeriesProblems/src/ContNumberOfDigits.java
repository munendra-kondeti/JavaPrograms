
public class ContNumberOfDigits {

	public static void main(String[] args) {
		int num = 0123; // if give zero in front value -1 happening 
		// Because here 0 means octal so it convert into as base 10 to base 8
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println(count);
		System.out.println(num);
	}

}
