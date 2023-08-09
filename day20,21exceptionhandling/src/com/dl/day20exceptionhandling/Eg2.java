package com.dl.day20exceptionhandling;

public class Eg2 {
	public static void main(String[] args) {

		try {
			int a[] = { 10, 20, 30, 40, 50 };

			System.out.println(a[0]);
			System.out.println(a[2]);
			System.out.println(a[5]); //java.lang.ArrayIndexOutOfBoundsException

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println("After");
	}

}
