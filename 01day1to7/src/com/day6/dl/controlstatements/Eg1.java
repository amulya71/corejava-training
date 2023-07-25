package com.day6.dl.controlstatements;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		// int age = 20;
		System.out.println("Enter Your Age ? ");
		Scanner scr = new Scanner(System.in);
		int age = scr.nextInt();
		

		if (age >= 18) {
			System.out.println("you are eligible to vote");
		} else {
			System.out.println("you are not eligible to vote");
		}
		scr.close();
	}

}
