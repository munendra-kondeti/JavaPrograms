package com.kn.whileloop;

import java.util.Scanner;

public class FrequencyOfEachDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a numbers ");
		int num = scan.nextInt();
		scan.close();
		findFrequency(num);
	}

	static void findFrequency(int num) {
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
		while (num > 0) {
			int f = num % 10;
			switch (f) {
			case 1 -> one++;
			case 2 -> two++;
			case 3 -> three++;
			case 4 -> four++;
			case 5 -> five++;
			case 6 -> six++;
			case 7 -> seven++;
			case 8 -> eight++;
			case 9 -> nine++;
			}
			num /= 10;
		}
		System.out.println("one " + one);
		System.out.println("two " + two);
		System.out.println("three " + three);
		System.out.println("four " + four);
		System.out.println("five " + five);
		System.out.println("six " + six);
		System.out.println("seven " + seven);
		System.out.println("eight " + eight);
		System.out.println("nine " + nine);

	}

}
