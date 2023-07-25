package com.dl.day7.iterationstatements;

import java.util.Scanner;

public class Eg3 {
		static Scanner Scanner;
		
	public static void main(String[] args) {
		//Iteration statements for, do-while,while
		
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
		}
		System.out.println(" ");
		
		for (int i = 5; i >=0; i--) {
			System.out.println(i);
		}
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int ii = scr.nextInt();
		for (System.out.println(ii);  ii <=5 ; ii++) {
			System.out.println(ii);
		
			scr.close();
		}
		
	}
	
	}

