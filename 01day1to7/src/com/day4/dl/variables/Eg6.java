package com.day4.dl.variables;

public class Eg6 {

	public static void main(String[] args) {
		new Eg6();
	}

	{
		System.out.println("INSTANCE BLOCK");
	}
	static {
		System.out.println("STATIC BLOCK");
	}
}