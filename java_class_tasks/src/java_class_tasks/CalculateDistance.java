package java_class_tasks;

import java.util.Scanner;

public class CalculateDistance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enetr speed :");
		double speed = scan.nextDouble();
		System.out.print("Enetr time :");
		double time = scan.nextDouble();
		scan.close();
		double distandce = calculateDistance(speed, time);
		System.out.println("Distance Travelled " + distandce);
	}

	static double calculateDistance(double speed, double time) {
		return speed * time;
	}

}
