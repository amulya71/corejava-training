package com.dl.day17.string;

public class Eg1 {
	public static void main(String[] args) {
		// string are sequences of characters
		char ch[] = { 'h', 'a', 'n', 's', 'n', 'a', ' ', 'k', 'r', 'i', 'i', 't', 'i' };
		System.out.println(ch);
		// string is immutable
		// how many ways we can create a string
		// two ways:sting literal and using new keyword

		// literal
		String s1 = "hansna kriiti";
		System.out.println(s1);

		// new
		String s2 = new String("hansna kriiti");
		System.out.println(s2);

	}

}
