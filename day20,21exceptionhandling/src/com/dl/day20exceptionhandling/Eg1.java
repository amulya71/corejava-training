package com.dl.day20exceptionhandling;

public class Eg1 {
	public static void main(String[] args) {
		System.out.println("Before");

		try {
			int a = 10;
			int b = 2;
			int c = 0;

			System.out.println(a / b);
			System.out.println(a / c); //java.lang.ArithmeticException

		} catch (ArithmeticException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println("After");
	}

}
