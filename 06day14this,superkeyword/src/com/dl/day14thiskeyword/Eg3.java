package com.dl.day14thiskeyword;

class I {
	public I() {
		System.out.println("Default cons I");
	}

	public I(int a) {
		System.out.println("para cons " + a);
	}
}

class J extends I {
	public J() {
		super(10);
		System.out.println("Default cons J");
	}

	public J(int a, int b) {
		this();
		System.out.println("para cons " + a + " " + b);
	}
}

public class Eg3 {
	public static void main(String[] args) {
		new J();
		new J(10, 20);
	}

}
