package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Eg2 {

	static void f2c(float fahrenheit) {
		float celsius = (fahrenheit - 32 * 5) / 9;
		System.out.println(fahrenheit + " fahrenheit = " + celsius + " celsius");
	}

	static void c2f(float celsius) {
		float fahrenheit = ((celsius * 9) / 5) + 32;
		System.out.println(celsius + " celsius = " + fahrenheit + " fahrenheit");
	}

	public static void main(String[] args) {
		System.out.println(" ## Welcome to temprature convetion programe ##");
		Scanner scr = new Scanner(System.in);

		System.out.println("Enter a value:");
		float val = scr.nextFloat();

		System.out.println("Enter type of value as C or F" + "< C = celsius | F = fahrenheit >");
		char ch = scr.next().charAt(0);

		System.out.println("Your conversion is bellow");

		if (ch == 'F') {
			f2c(val);
		} else {
			c2f(val);
		}
		scr.close();
	}
}
