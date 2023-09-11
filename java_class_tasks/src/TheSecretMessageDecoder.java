import java.util.Scanner;

public class TheSecretMessageDecoder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr a char ");
		System.out.print("Decoded message = "+ decoderCharacter(scan.next().charAt(0)));
		scan.close();
		
	}

	static int decoderCharacter(char ch) {
		return ch;
	}

}
