
public class PrintEvenElementsPresentInOddIndex {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (isOdd(i))
				if (isEven(arr[i]))
					System.out.println(arr[i]);
		}
	}

	private static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;

		return false;
	}

	private static boolean isOdd(int number) {
		if (number % 2 != 0)
			return true;

		return false;
	}

}
