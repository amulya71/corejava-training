package com.dl.day20exceptionhandling;

public class Eg3 {
	public static void main(String[] args) {
		System.out.println("Before");
		try {
			String s1 = null;
			System.out.println(s1);
			System.out.println(s1.length()); //java.lang.NullPointerException

		} catch (NullPointerException e) {
			System.out.println("Exception : " + e);
		}
		System.out.println("After");
	}

}
