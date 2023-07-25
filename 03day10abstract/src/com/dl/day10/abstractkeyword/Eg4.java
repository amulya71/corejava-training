package com.dl.day10.abstractkeyword;

public abstract class Eg4 {
	static int a = 10;
	int b = 20;
	static {
		System.out.println("static block");
	}

	// in abstract class only static members are allowed
	public static void main(String[] args) {
		System.out.println(a);
		// new Eg4();
	}
}
