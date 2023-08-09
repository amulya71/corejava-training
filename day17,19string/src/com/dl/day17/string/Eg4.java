package com.dl.day17.string;

public class Eg4 {
	public static void main(String[] args) {
		// concat()

		String s1 = "Java";
		System.out.println(s1);
		String s2 = s1.concat("Python");
		System.out.println(s2);
		System.out.println(s1);

		String s3 = new String("Java");
		String s4 = s3.concat("Python");
		System.out.println(s4);

		String s5 = "Apple";
		String s6 = "Lg";
		String s7 = "Samsung";
		String s8 = s5.concat(s6).concat(s7);
		System.out.println(s8);

		String s9 = "java";
		String s10 = "Java";
		System.out.println(s9.equals(s10));
		System.out.println(s9.equalsIgnoreCase(s10));
	}

}
