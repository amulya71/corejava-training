package com.day6.dl.controlstatements;

import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {

		System.out.println("ChruchDetails : ");
		Scanner scr = new Scanner(System.in);
		String ChuchTimings = scr.next();
		
		String ChruchDetails = "Sunday";
		//ChruchDetails= sunday ,monday, tuesday,wednesday,thursday,friday,saturday;
		
		switch (ChuchTimings) {
		case "Sunday ChruchDetails":
			System.out.println("If members are > 30 then 10am to 12pm --Chruch" + "\n"
					+ "If members are < 30 then 10am to 1pm --Chruch");
			break;

		case "Monday ChruchDetails":
			System.out.println("If members are > 5 then Singing practice" + "\n"
					+ "If members are > 10 then Singing practice will be conducted afternoon" + "\n"
					+ "If members are > 4 then Singing practice is evening");
			break;

		case "Tuesday ChruchDetails":
			System.out.println("3pm --Womens worship");
			break;

		case "Wednesday ChruchDetails":
			System.out.println("11am-12pm = Boys Bible Study" + "\n" + "4pm-5pm = Girls Bible Study");
			break;

		case "Thursday ChruchDetails":
			System.out.println("10am-5pm = Street Preach" + "\n" + "Breakfast--8am , Lunch--1pm, Dinner--8pm");
			break;

		case "Friday ChruchDetails":
			System.out.println("10am-11am = Elders Chruch Gathering" + "\n" + "4pm--5pm = Youngers Chruch Gathering");
			break;

		case "Saturday ChruchDetails":
			System.out.println("8am--12pm = Fasting Prayer");
			break;

		default:
			System.out.println("Every one can attendt to the chruch");
			break;
		}
		scr.close();

	}

}
