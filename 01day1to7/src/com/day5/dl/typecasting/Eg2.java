package com.day5.dl.typecasting;

public class Eg2 {

	public static void main(String[] args) {
		// Explicit casting

		double d = 10.0;
		System.out.println(d);

		float f = (float) d;
		System.out.println(f);

		long l = (long) f;
		System.out.println(l);

		int i = (int) l;
		System.out.println(i);

		short s = (short) i;
		System.out.println(s);

		byte b = (byte) s;
		System.out.println(b);

		long l1 = 65;
		char ch = (char) l1;
		System.out.println(ch);

		int i1 = 10;
		int i2 = 20;
		short s1 = (short) (i1 + i2);
		System.out.println(s1);

		long l2 = 30;
		byte bb = (byte) (short) (int) (long) l2;
		System.out.println(bb);

	}

}
