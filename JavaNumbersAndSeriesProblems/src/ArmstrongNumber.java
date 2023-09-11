
public class ArmstrongNumber {

	public static void main(String[] args) {
		int givenNumber = 153;
		int temp = givenNumber;
		int amstrongNumber = 0;
		while (givenNumber > 0) {
			int r = givenNumber % 10;
			int exponental = 3;
			// Find the power here
			int powervalue = 1;
			while( exponental != 0) {
				powervalue *= r;
				 --exponental;
			}
			exponental = 3;
			amstrongNumber += powervalue;
			givenNumber /= 10;
		}
		if (temp == amstrongNumber)
			System.out.println("Its AmstrongNumber");
		else
			System.out.println("Not AmstrongNumber");
	}

}
