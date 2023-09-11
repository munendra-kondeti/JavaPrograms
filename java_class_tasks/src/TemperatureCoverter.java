import java.util.Scanner;

public class TemperatureCoverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr temperature in -F ");
		double fahrenheit = scan.nextDouble();
		double celsius = temperatureConverter(fahrenheit);
		System.out.println("Celsius "+ celsius);
		scan.close();
	}

	static double temperatureConverter(double fahrenheit) {

		return ((fahrenheit-32)*5)/9;
	}

}
