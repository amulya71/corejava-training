package com.dl.day16Arrays;

public class Eg7 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		// length // 1 2 3 4 5 6 7 8 9
		// index 0 1 2 3 4 5 6 7 8

		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}
		System.out.println(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(" ");
		for (int i = 0; i <= a.length; i++) {
			System.out.println(a[i]); // java.lang.ArrayIndexOutOfBoundsException
		}
	}

}
