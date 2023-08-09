package com.dl.day17.string;

public class Eg5 {
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B";
		String s3 = "A";

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s3));

		String s4 = "a";
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareToIgnoreCase(s1));
	}

}
