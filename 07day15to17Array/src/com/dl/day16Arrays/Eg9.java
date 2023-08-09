package com.dl.day16Arrays;

import java.util.Arrays;

public class Eg9 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(Arrays.toString(a));

		int b[] = new int[5];
		System.out.println(b);
		Arrays.fill(b, 10);
		System.out.println(Arrays.toString(b));
	}

}
