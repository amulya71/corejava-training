package com.day6.dl.controlstatements;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		System.out.println("Its started");

		Scanner scr = new Scanner(System.in);
		int key = scr.nextInt();

		switch (key) {
		case 1:
			System.out.println("its a Monday");
			break;
		case 2:
			System.out.println("its a Tuesday");
			break;
		case 3:
			System.out.println("its a Wednesday");
			break;
		case 4:
			System.out.println("its a Thursday");
			break;
		case 5:
			System.out.println("its a Friday");
			break;
		case 6:
			System.out.println("its a Saturday");
			break;
		case 7:
			System.out.println("its a Sunday");
			break;
		default:
			System.out.println("Its not a week, plz menction 1 to 7 numbers only");
			break;
		}
		scr.close();

	}

}
