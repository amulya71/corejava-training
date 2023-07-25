package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Eg6 {
	public static void main(String[] args) {
		//Transfer statements
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				break;//stops the iteration 
			}
			System.out.println(i);
		}
		System.out.println(" ");
		for (int i = 0; i < 10; i++) {
			if(i==5) {
				continue;//skips the current iteration 
			}
			System.out.println(i);
		}
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int ii = scr.nextInt();
		for ( ii =0; ii < 10; ii++) {
			if(ii==8) {
				break;
	}
			System.out.println(ii);
			scr.close();
		}
	}
}
			

