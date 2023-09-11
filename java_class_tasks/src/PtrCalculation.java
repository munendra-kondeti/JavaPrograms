import java.util.Scanner;

public class PtrCalculation {

	public static void main(String[] args) {
		//( p * r *t )/ 100
		Scanner sca = new Scanner(System.in);
		System.out.println("Percentage "+ percentage(sca.nextInt(),sca.nextInt(),sca.nextInt()));
	}

	private static int percentage(int nextInt, int nextInt2, int nextInt3) {
		// TODO Auto-generated method stub
		return (nextInt*nextInt2*nextInt3)/100;
	}

}
