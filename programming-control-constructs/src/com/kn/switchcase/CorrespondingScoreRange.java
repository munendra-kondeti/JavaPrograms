package com.kn.switchcase;

import java.util.Scanner;

public class CorrespondingScoreRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score :- ");
		char grade = scan.next().charAt(0);
		scan.close();
		System.out.println(correspondingScore(grade));

	}

	static String correspondingScore(char grade) {
		return switch (grade) {
		case 'A', 'a' -> "100-91";
		case 'B', 'b' -> "90-81";
		case 'C', 'c' -> "80-71";
		case 'D', 'd' -> "70-61";
		case 'F', 'f' -> "40-0";
		default -> "Not A Valid Grade ";
		};

	}

}
