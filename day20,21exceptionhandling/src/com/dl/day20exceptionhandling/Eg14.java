package com.dl.day20exceptionhandling;

public class Eg14 {
	public static void main(String[] args) {
		try {
			System.out.println("Try Block");
			//System.exit(0);
		} catch (Exception e) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
		}
		try {
			System.out.println("Try Block");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
		}
	}

}
