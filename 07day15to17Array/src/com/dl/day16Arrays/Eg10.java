package com.dl.day16Arrays;

import java.util.Arrays;

public class Eg10 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = { 10, 20, 30, 40, 50 };
		int c[] = { 10, 60, 50, 70, 30, 20, 40 };

		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(a, c));

		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
	}

}
