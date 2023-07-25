package com.day3.dl.variabes;

public class Eg2 {
	// Types of variables
	// static variables
	static int X = 100;
	static int Y = 200;

	// Non static variables/Instance variables
	int i = 1000;
	int j = 2000;

	// Main method
	public static void main(String[] args) {
		// Local variables
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);

		// Direct access because main method is static
		System.out.println(X);
		System.out.println(Y);

		// ClassName.VariableName
		System.out.println(Eg2.X);
		System.out.println(Eg2.Y);

		// new keyword denotes that we are creating object
		// object name and class name must be same
		// eg is object reference

		Eg2 eg = new Eg2();
		System.out.println(eg.i);
		System.out.println(eg.j);

	}

}
