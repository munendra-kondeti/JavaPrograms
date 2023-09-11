package com.kn.strings;

public class StringInBuildMethods {

	public static void main(String[] args) {
		String string = "    muni kondeti";
		System.out.println(string.length());
		System.out.println(string.startsWith("m"));
		System.out.println(string.endsWith("i"));
		System.out.println(string.replace('e', 'a'));
		System.out.println(string.replaceAll("kondeti", "k"));
		for(String ele:string.split(" "))
			System.out.println(ele);
		System.out.println(string.trim());
		System.out.println(string.toCharArray());
	}

}
