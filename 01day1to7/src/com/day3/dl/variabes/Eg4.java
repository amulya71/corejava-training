package com.day3.dl.variabes;

public class Eg4 {
	static int a = 10;
	static int b = 20;
	int c = 30;

	public void m1() {
		//System.out.println(a + " : test");
		System.out.println(Eg4.a);
		System.out.println(Eg4.b);
		System.out.println(c);
	}

	public static void m2() {
		Eg4 eg = new Eg4();
		System.out.println(a);
		System.out.println(b);
		System.out.println(eg.c);

	}

	public static void main(String[] args) {
		Eg4 eg = new Eg4();
		eg.m1();
		m2();
	}

}
