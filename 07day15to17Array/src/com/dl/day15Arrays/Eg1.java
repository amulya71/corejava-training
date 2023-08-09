package com.dl.day15Arrays;

public class Eg1 {
	public static void main(String[] args) {
		// Arrays are fixed in size
		// once we declare an array we cannot increase the size
		// Arrays are homogenious

		// Declare an array and provide size to it
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		//a[5] = 60; //java.lang.ArrayIndexOutOfBoundsException

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);

	}

}
