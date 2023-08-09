package com.dl.day17.string;

public class Eg6 {

	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());

		String s2 = "Java is ServerSide , Python is ServerSide , JavaScript is ServerSide ";
		System.out.println(s2.indexOf("ServerSide"));
		System.out.println(s2.lastIndexOf("ServerSide"));
		System.out.println(s2.indexOf("ServerSide", 15));

		String s3 = "Hello Java , Hello Python , Hello JavaScript";
		System.out.println(s3.replace("H", "h"));
		System.out.println(s3.replace("Hello", "Hi"));
	}

}
