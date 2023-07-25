package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("please enter your celsius temp : ");

		float cel = scr.nextFloat();
		System.out.println("converted value to fahrenheit is : ");
		System.out.println( (cel * 9 / 5) + 32);
		
		System.out.println(" ");
		
		System.out.println("please enter your fahrenheit temp : ");

		float fah = scr.nextFloat();
		System.out.println("converted value to celsius is : ");
		System.out.println((fah - 32) * 5/9 );
		
		scr.close();

	}

}
