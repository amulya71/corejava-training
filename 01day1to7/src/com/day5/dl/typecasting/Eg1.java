package com.day5.dl.typecasting;

public class Eg1 {
	public static void main(String[] args) {
		// Implicit casting
		// lower to high
		byte b = 10;
		System.out.println(b);

		short s = b;
		System.out.println(s);

		int i = s;
		System.out.println(i);

		long l = i;
		System.out.println(l);

		//float f = b;    //we can write in both the ways 
		float f = l;
		System.out.println(f);

		double d = f;
		System.out.println(d);

		char ch = 'A';
		int bb = ch;
		System.out.println(bb);

	}
}