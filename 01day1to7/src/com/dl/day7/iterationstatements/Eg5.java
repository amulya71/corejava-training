package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Eg5 {
	public static void main(String[] args) {
		/*
		 * do { System.out.println("do block"); } while (false); int i=1; do {
		 * System.out.println(i); i++; } while (i<=5);
		 */
		
		
		//--------------------------------
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int i = scr.nextInt();
		do {
			System.out.println(i);
			i++;
			
		} while (i<=5);
		
		
		
		
		scr.close();
	}

}
