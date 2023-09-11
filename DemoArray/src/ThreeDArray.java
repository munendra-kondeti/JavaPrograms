import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Array declaration and creation
		long arr[][][] = new long[2][2][2];

		// initializing
		// 1st
		for (byte i = 0; i < arr.length; i++)
			// 2nd
			for (byte j = 0; j < arr[i].length; j++)
				// 3rd
				for (byte k = 0; k < arr[i][j].length; i++) {
					System.out.println("Enter data for " + i + " " + j + " " + k + " ");
					arr[i][j][k] = scanner.nextLong();
				}
		//Scanner closed
		scanner.close();
		// traversing
		for (long[][] firstSet : arr)
			for (long[] secondSet : firstSet)
				for (long threeSet : secondSet)
					System.out.println(threeSet);

	}

}
