package com.dl.day17.string;

public class Eg11 {
	public static void main(String[] args) {
		String s1 = "Java and Python";
		char[] charArray = s1.toCharArray();
		System.out.println(charArray);
		charArray[5] = 'A';
		System.out.println(charArray);
		System.out.println(s1);
	}

}
