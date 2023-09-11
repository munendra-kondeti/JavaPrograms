
public class StoreOneArrayIntoAnotherArryaInReverseOrder {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] brr = new int[arr.length];
		for (int i = brr.length - 1, j = 0; i >= 0; i--, j++) {
			brr[j] = arr[i];
		}
		
		System.out.println("arr");

		for (int i = 0; i < brr.length; i++)
			System.out.print(arr[i]);
		
		System.out.println();
		System.out.println("brr");

		for (int i = 0; i < brr.length; i++)
			System.out.print(brr[i]);

	}

}
