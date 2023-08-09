package com.dl.day17.string;

public class Eg12 {
	public static void main(String[] args) {
		String s1 = new String("Hello Java and Hello Python");
		System.out.println(s1);

		StringBuilder sb1 = new StringBuilder(s1);
		sb1.deleteCharAt(4);
		System.out.println(sb1);

	}

}
