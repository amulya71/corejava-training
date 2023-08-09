package com.dl.day20exceptionhandling;

public class Eg6 {
	public static void main(String[] args) {
		System.out.println("Before");
		try {
			String s1 = "Hello Java";
			System.out.println(s1);

			System.out.println(s1.charAt(0));
			System.out.println(s1.charAt(15)); //java.lang.StringIndexOutOfBoundsException

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e);
		}
	}

}
