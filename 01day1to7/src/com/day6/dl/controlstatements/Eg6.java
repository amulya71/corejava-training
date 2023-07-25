package com.day6.dl.controlstatements;

import java.util.Scanner;

public class Eg6 {

	private static final String sun = "SUNDAY";
	private static final String mon = "MONDAY";
	private static final String tues = "TUESDAY";
	private static final String wed = "WEDNESDAY";
	private static final String thur = "THURSDAY";
	private static final String fri = "FRIDAY";
	private static final String sat = "SATURDAY";

	public static void main(String[] args) {
		
		
		 
		System.out.println("Enter a week name here : ");
		Scanner scr = new Scanner(System.in);
		String week = scr.next();

		System.out.println("Enter the strength here : ");
		int strength = scr.nextInt();

		System.out.println("Enter the willing time : ");
		double time = scr.nextDouble();

		System.out.println("chruch program will happens as below : ");

		switch (week) {
		case sun:
			if (strength > 30) {
				System.out.println("10am to 12pm --Chruch");
			} else {
				System.out.println("10am to 1pm --Chruch");
			}

			break;

		case mon:
			if (strength > 5) {
				System.out.println("Singing practice is in the morning");
			} else if (strength > 10) {
				System.out.println("Singing practice will be conducted afternoon");
			} else {
				System.out.println("Singing practice is evening");
			}
			break;

		case tues:
			System.out.println("3pm --Womens worship");
			break;

		case wed:
			if ((time >= 11) && (time <= 12)) {
				System.out.println("11am-12pm = Boys Bible Study");
			} else if ((time >= 4) && (time <= 5)) {
				System.out.println("4pm-5pm = Girls Bible Study");
			} else {
				System.out.println("No Activity in chuch");
			}
			break;

		case thur:
			if ((time >= 10) && (time <= 5)) {
				System.out.println("10am-5pm = Street Preach" + "\n" + "Breakfast--8am , Lunch--1pm, Dinner--8pm");
			} else {
				System.out.println("Preparing for 10am-5pm = Street Preach ");
			}
			break;

		case fri:
			if ((time >= 10) && (time <= 11)) {
				System.out.println("Elders Chruch Gathering");
			} else if ((time >= 4) && (time <= 5)) {
				System.out.println("Youngers Chruch Gathering");
			} else {
				System.out.println("No Activity in chuch");
			}
			break;

		case sat:
			System.out.println("8am--12pm = Fasting Prayer");
			break;

		default:
			System.out.println(week+ " is not a wallied week");
			break;
		}
		scr.close();

	}

}
