
public class PrintAllEvenElements {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			if (isEven(arr[i]))
				System.out.println(arr[i]);
		}
	}

	// method check is even or not
	private static boolean isEven(int element) {
		if (element % 2 == 0)
			return true;

		return false;
	}

}
