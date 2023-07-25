package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Eg4 {
	public static void main(String[] args) {
		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println(" ");
		
		  i=5;
		while (i>=1) {
			System.out.println(i);
			i--;
		}
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int j = scr.nextInt();
		while (j<=5) {
			System.out.println(j);
			j++;
			
		}
		scr.close();
	}
	
}
