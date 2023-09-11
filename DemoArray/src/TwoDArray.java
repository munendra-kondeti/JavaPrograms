import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// array declaration
		byte arr[][];
		// Creation
		arr = new byte[2][2];
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the value for " + i + " of element " + j + " ");
				arr[i][j] = scanner.nextByte();
			}
		scanner.close();

		// traversing
		for (byte firstSet[] : arr)
			for (byte elements : firstSet)
				System.out.println(elements);
	}

}
