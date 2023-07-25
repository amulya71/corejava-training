package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Cb {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("### Enter the values for cb ### ");
		System.out.println("units usage of IronBox : ");
		int ironBox = scr.nextInt();

		System.out.println("units usage of Television : ");
		int television = scr.nextInt();

		System.out.println("units usage of Light : ");
		int light = scr.nextInt();

		System.out.println("units usage of Fan : ");
		int fan = scr.nextInt();

		int day = ironBox + television + light + fan;
		int year = day * 365;

		System.out.println("year consumption of units = " + year);

		scr.close();
	}

}
