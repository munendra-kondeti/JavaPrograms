package com.kn.switchcase;

import java.util.Scanner;

public class TrafficLightColor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your Colors please ");
		String color = scan.next();
		System.out.println((yourAction(color)));
	}

	static String yourAction(String color) {
		return switch (color) {
		case "Red" -> "STOP";
		case "Yellow" -> "Ready to go";
		case "green" -> "GO";
		default -> "Give Proper signal";
		};
	}
}
