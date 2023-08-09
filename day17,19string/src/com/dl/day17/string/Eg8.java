package com.dl.day17.string;

public class Eg8 {
	public static void main(String[] args) {
		String s1 = "Hello Java and Python";
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.startsWith("h"));

		System.out.println(s1.endsWith("n"));
		System.out.println(s1.endsWith("N"));

		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("java"));
	}

}
