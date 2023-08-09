package com.dl.day16Arrays;

public class Eg6 {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };

		int i = 0;
		do {
			System.out.println(a[i]);
			i++;
		} while (i < 5);

		System.out.println(" ");
		int j = 4;
		do {
			System.out.println(a[j]);
			j--;
		} while (j >= 0);
	}

}
