package com.day6.dl.controlstatements;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		// String day = "Friday";

		System.out.println("Enter a Week Name : ");
		Scanner scr = new Scanner(System.in);
		String day = scr.next();

		switch (day) {
		case "Sunday":
			System.out.println("Its a 1");
			break;

		case "Monday":
			System.out.println("Its a 2");
			break;

		case "Tuesday":
			System.out.println("Its a 3");
			break;
		case "Wednesday":
			System.out.println("Its a 4");
			break;
		case "Thursday":
			System.out.println("Its a 5");
			break;
		case "Friday":
			System.out.println("Its a 6");
			break;
		case "Saturday":
			System.out.println("Its a 7");
			break;

		default:
			System.out.println("Its not a week");
			break;
		}
		scr.close();
	}

}
