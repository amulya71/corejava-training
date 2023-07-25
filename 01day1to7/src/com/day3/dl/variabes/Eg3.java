package com.day3.dl.variabes;

public class Eg3 {
	// Instance variables
	int a = 10;
	int b = 20;

	public static void main(String[] args) {
		// calling instance method
		Eg3 eg = new Eg3();
		eg.m1();
		System.out.println(eg.a);
		System.out.println(eg.b);
	}

	// Instance method
	public void m1() {
		System.out.println(a);
		System.out.println(b);
	}

}
