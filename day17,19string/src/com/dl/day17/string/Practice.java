package com.dl.day17.string;

public class Practice {
	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "Hello";
		
		//String s1 = new String ("Hello");
		//String s2 = new String ("Hello");

		display(s1, s2);
		print(s1, s2);
		show(s1, s2);

	}

	static void display(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("Im in ==");
		} else if (s1.equals(s2)) {
			System.out.println("Im in .equals");
		} else {
			System.out.println("Im in else");
		}
		System.out.println();
	}

	static void print(String s1, String s2) {
		if (s1.equals(s2)) {
			System.out.println("Im in .equals");
		} else if (s1 == s2) {
			System.out.println("Im in ==");
		} else {
			System.out.println("Im in else");
		}
		System.out.println();
	}

	static void show(String s1, String s2) {
		System.out.println("== :" + (s1 == s2));
		System.out.println(".equals :" + s1.equals(s2));
	}

}
