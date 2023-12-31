import java.util.Scanner;

public class TwoDJaggedArray {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);

		// Array declaration and creation
		System.out.println("Enter size of the 1st Dimention ");
		int arr[][] = new int[scanner.nextInt()][];
		for (byte i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of the 2nd Dimention of each object in the 1D " + i);
			arr[i] = new int[scanner.nextInt()];
		} 

		// Array initialization

		for (byte i = 0; i < arr.length; i++)
			for (byte j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the element data for " + i + " " + j);
				arr[i][j] = scanner.nextInt();
			}
		scanner.close();

		// Traversing or display

		for (int[] firstD : arr)
			for (int secondD : firstD)
				System.out.println(secondD);
	}
}
