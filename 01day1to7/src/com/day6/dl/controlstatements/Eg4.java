package com.day6.dl.controlstatements;

import java.util.Scanner;

public class Eg4 {

	public static void main(String[] args) {

		// String clgDetails = "ThirdYear";
		// String FirstYear = "year1";

		System.out.println("Enter Your Year : ");
		Scanner scr = new Scanner(System.in);
		String clgDetails = scr.next();

		switch (clgDetails) {
		case "FirstYear":
			System.out.println("you are in 1st year :  " + "\n" + " subjects = 5 " + "\n " + "labs = 2" + "\n "
					+ "examfees = 2500" + "\n " + "semesters = 1");
			break;

		case "SecondYear":
			System.out.println("you are in 2nd year : " + "\n" + "subjects = 6" + "\n" + "labs = 3" + "\n"
					+ "examfees = 2500" + "\n" + "semesters = 2");
			break;

		case "ThirdYear":
			System.out.println("you are in 3rd year : " + "\n" + "subjects = 3" + "\n" + "labs = 1" + "\n"
					+ "examfees = 5000" + "\n" + "semesters = 2" + "\n" + "project=1");
			break;

		default:
			System.out.println("you are not in clg");

			break;
		}
		scr.close();
	}

}
