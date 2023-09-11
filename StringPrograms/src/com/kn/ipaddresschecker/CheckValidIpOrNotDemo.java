package com.kn.ipaddresschecker;

import java.util.Scanner;

public class CheckValidIpOrNotDemo {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a ip address to check its valid or not:- ");
		String string = scanner.nextLine();
		// create object
		CheckValidIpOrNot checkValidIpOrNot = new CheckValidIpOrNot();
		// call method
		boolean flag = checkValidIpOrNot.isValidIp(string);

		// Printing based on the above method returns the boolean
		if (flag) {
			System.out.println("Its a valid ip");
		} else {
			System.out.println("Its not a valid ip");
		}

		// Release resources
		scanner.close();
	}

}
