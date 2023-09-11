
public class ReplacePrimeNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		// Logic
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i]))
				arr[i] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	// this method checks the given number prime or not ;
	private static boolean isPrime(int number) {

		for (int i = 2; i <number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
